package model;

public class User {
	private String id;
	private String firstName;
	private String lastName;
	private String ip;
	private boolean voted;
	private String time;
	
	
	public User(){
		this.voted = false;
		this.id = String.valueOf(this.hashCode());
	}
	public User(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		this.voted = false;
		this.id = String.valueOf(this.hashCode());

	}
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public boolean isVoted() {
		return voted;
	}

	public void setVoted(boolean voted) {
		this.voted = voted;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	

	
}