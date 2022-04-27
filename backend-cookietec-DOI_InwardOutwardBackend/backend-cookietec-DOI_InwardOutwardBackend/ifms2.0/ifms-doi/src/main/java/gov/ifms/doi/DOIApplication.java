package gov.ifms.doi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DOIApplication {

	public static void main(String[] args) {
		SpringApplication.run(DOIApplication.class, args);
	}

}
