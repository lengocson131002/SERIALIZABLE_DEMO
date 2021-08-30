package classes;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String ID;
	public String firstname;
	public String lastname;
	public String address;

	public Student() {}
	
	public Student(String iD, String firstname, String lastname, String address) {
		ID = iD;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}
	@Override
	public String toString() {
		return "ID: " + this.ID
			+"\nFirstname: " + this.firstname
			+"\nLastname: " + this.lastname
			+"\nAddress: "+ this.address;
	}
	
}
