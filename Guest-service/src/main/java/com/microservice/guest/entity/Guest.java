package com.microservice.guest.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
//import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Guest")
public class Guest {
	
	@Id
	@NotNull(message="Guest ID cannnot be null")
	@Size(min=10,message="Guest ID should be minimum 10 digits")
	private long guestId;
	@NotNull(message="Guest Name cannnot be null")
	@Size(min=3,message="Guest Name should be minimum 3 digits")
	private String guestName;
	@NotNull(message="Guest Contact cannnot be null")
	@Size(min=10,message="Guest Contact should be minimum 10 digits")
	private long guestContact;
	@NotNull(message="Guest MailID cannnot be null")
	@Size(min=12,message="Guest MailID should be minimum 12 digits")
	private String guestEmail;
	@NotNull(message="Guest Gender cannnot be null")
	@Size(max=5,message="Guest Gender should be maximum 5 digits")
	private String guestGender;
	@NotNull(message="Guest Address cannnot be null")
	@Size(min=5,message="Guest Address should be minimum 5 digits")
	private String guestAddress;
	
	public long getGuestId() {
		return guestId;
	}
	public void setGuestId(long guestId) {
		this.guestId = guestId;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public long getGuestContact() {
		return guestContact;
	}
	public void setGuestContact(long guestContact) {
		this.guestContact = guestContact;
	}
	public String getGuestEmail() {
		return guestEmail;
	}
	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}
	public String getGuestGender() {
		return guestGender;
	}
	public void setGuestGender(String guestGender) {
		this.guestGender = guestGender;
	}
	public String getGuestAddress() {
		return guestAddress;
	}
	public void setGuestAddress(String guestAddress) {
		this.guestAddress = guestAddress;
	}
	
	public Guest(@NotNull(message="Guest ID cannnot be null")@Size(min=10,message="Guest ID should be minimum 10 digits")long guestId, 
			@NotNull(message="Guest Name cannnot be null")@Size(min=3,message="Guest Name should be minimum 3 digits")String guestName,
			@NotNull(message="Guest Contact cannnot be null")@Size(min=10,message="Guest Contact should be minimum 10 digits")long guestContact,
			@NotNull(message="Guest MailID cannnot be null")@Size(min=12,message="Guest MailID should be minimum 12 digits")String guestEmail,
			@NotNull(message="Guest Gender cannnot be null")@Size(max=5,message="Guest Gender should be maximum 5 digits")String guestGender,
			@NotNull(message="Guest Address cannnot be null")@Size(min=5,message="Guest Address should be minimum 5 digits")String guestAddress) {
		super();
		this.guestId = guestId;
		this.guestName = guestName;
		this.guestContact = guestContact;
		this.guestEmail = guestEmail;
		this.guestGender = guestGender;
		this.guestAddress = guestAddress;
	}
	public Guest() {
		
	}
	
	@Override
	public String toString() {
		return "Guest [guestId=" + guestId + ", guestName=" + guestName + ", guestContact=" + guestContact
				+ ", guestEmail=" + guestEmail + ", guestGender=" + guestGender + ", guestAddress=" + guestAddress
				+ "]";
	}
		
}
