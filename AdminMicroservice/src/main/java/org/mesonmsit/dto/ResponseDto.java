package org.mesonmsit.dto;

public class ResponseDto {
	
	private Object response;
	private boolean errFlag;
	private String message;
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object response) {
		this.response = response;
	}
	public boolean isErrFlag() {
		return errFlag;
	}
	public void setErrFlag(boolean errFlag) {
		this.errFlag = errFlag;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
