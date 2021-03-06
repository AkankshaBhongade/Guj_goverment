package gov.ifms.gst.util;

import gov.ifms.edp.dto.ClueDto;
import gov.ifms.edp.dto.EDPMsMenuDto;
import gov.ifms.edp.oauth.dto.OAuthTokenPostDTO;
import gov.ifms.edp.oauth.util.OAuthUtility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

import java.util.List;

@Configuration
//@Component("auth")
@PropertySource(ignoreResourceNotFound = false, value = "classpath:/messages/gst.properties")
@EnableAsync
public class GstConfig {

    private Logger logger = LogManager.getLogger(this.getClass());

    public Logger getLogger() {
        return logger;
    }


    /**
     * MessageSource is used for read messages from own module. This makes it
     * independent from others module. One can get entire configuration and message
     * with gst module.
     *
     * @param reloadableResourceBundleMessageSource
     * @return
     */

    @Bean
    public MessageSource gstMessageSource(ReloadableResourceBundleMessageSource reloadableResourceBundleMessageSource) {
        getLogger().info(
                () -> "Total message properties required." + reloadableResourceBundleMessageSource.getBasenameSet());
        reloadableResourceBundleMessageSource.addBasenames("classpath:/messages/gst");
        reloadableResourceBundleMessageSource.clearCache();
//            reloadableResourceBundleMessageSource.setCacheMillis(1000); //if one have to reload cache runtime then required this param
        return reloadableResourceBundleMessageSource;
    }

    /**
     * This method is used in PreAuthorize tag. it might be on controller or service
     * layer. write @PreAuthorize tag on method. For example
     * : @PreAuthorize("@auth.hasAccess('"+
     * ACCESS_CREATE+","+ACCESS_VIEW+"','"+PayrollURLConstant.MENUID_PAYPERIOD+"')")
     * public void sample()
     *
     * @param rights
     * @param menuID
     * @return true/false
     */
    public boolean hasAccess(List<String> rights, List<String> menuID) {
        try {
            OAuthTokenPostDTO temp = OAuthUtility.getCurrentUserLoginPostFromOauthToken().getOauthTokenPostDTO();
            List<EDPMsMenuDto> menuDto = temp.getEdpMsMenuDtoList();
            return findMenu(menuDto, menuID, rights);
        } catch (Exception e) {
            getLogger().trace(e);
        }
        return false;
    }

	/**
	 * Find menu.
	 *
	 * @param menuDtoList the menu dto list
	 * @param menuID the menu ID
	 * @param rights the rights
	 * @return true, if successful
	 * @throws Exception the exception
	 */
	private boolean findMenu(List<EDPMsMenuDto> menuDtoList, List<String> menuID, List<String> rights)
			throws Exception {
		if (menuDtoList == null || menuDtoList.isEmpty()) {
			return false;
		}
		for (EDPMsMenuDto menuDto : menuDtoList) {
			for (String menu : menuID) {
				if (menu.equalsIgnoreCase(menuDto.getMenuId() + ""))
					return permission(rights, menuDto);
				if (findMenu(menuDto.getMenuDtos(), menuID, rights))
					return true;
			}

		}
		return false;
	}

    /**
     * Permission.
     *
     * @param rights the rights
     * @param menuDto the menu dto
     * @return true, if successful
     */
    private boolean permission(List<String> rights, EDPMsMenuDto menuDto) {
        List<ClueDto> permissionsDtoList = menuDto.getEdpMsRolePermissionsDto();
        if (permissionsDtoList != null) {
            for (ClueDto data : permissionsDtoList) {
                String permissionStr = data.getName();
                for (String singleRight : rights) {
                    boolean bSuccess = permissionStr.toUpperCase().contains(singleRight);
                    if (bSuccess) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
