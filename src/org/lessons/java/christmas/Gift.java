package org.lessons.java.christmas;

public class Gift {
	private String name;
	private String recipient;
	
	public Gift(String name, String recipient){
		setName(name);
		setRecipient(recipient);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
}
