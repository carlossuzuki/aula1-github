package entities;

public class Guest {
	public String name;
	public String eMail;
	
	public Guest(String name, String eMail) {
		this.name = name;
		this.eMail = eMail;
	}
	
	public String toString() {
		return  ": " + name + ", " + eMail;
	}
	

}
