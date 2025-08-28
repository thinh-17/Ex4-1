package murach.business;

import java.io.Serializable;

public class UserSelection implements Serializable {
	private String hear;
	private String receiveUp;
	private String receiveEmail;
	private String contact;
	
	public UserSelection() {
		hear = "";
		receiveUp = "";
		receiveEmail = "";
		contact = "";
	}
	
	public UserSelection(String hear, String receiveUp, String receiveEmail, String contact) {
		this.hear = hear;
		this.receiveUp = receiveUp;
		this.receiveEmail = receiveEmail;
		this.contact = contact;
	}

	public String getReceiveEmail() {
		return receiveEmail;
	}

	public void setReceiveEmail(String receiveEmail) {
		this.receiveEmail = receiveEmail;
	}

	public String getHear() {
		return hear;
	}

	public void setHear(String hear) {
		this.hear = hear;
	}

	public String getReceiveUp() {
		return receiveUp;
	}

	public void setReceiveUp(String receiveUp) {
		this.receiveUp = receiveUp;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}
}
