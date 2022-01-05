package org.mesonmsit.dto;

public class UserSearchDetailsDto {

	private String fullName;
	private long memberId;
	private String passoutYr;
	private String stream;
	
	
	
	public String getPassoutYr() {
		return passoutYr;
	}
	public void setPassoutYr(String passoutYr) {
		this.passoutYr = passoutYr;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public long getMemberId() {
		return memberId;
	}
	public void setMemberId(long memberId) {
		this.memberId = memberId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
}