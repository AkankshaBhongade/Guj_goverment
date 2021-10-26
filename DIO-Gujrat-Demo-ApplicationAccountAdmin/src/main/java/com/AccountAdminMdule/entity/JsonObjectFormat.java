package com.AccountAdminMdule.entity;

public class JsonObjectFormat {

	private String message;
	private boolean isSuccess;
	private Object data;

	public JsonObjectFormat(String message, boolean isSuccess, Object data) {
		super();
		this.message = message;
		this.isSuccess = isSuccess;
		this.data = data;
	}

	public JsonObjectFormat() {
		super();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
