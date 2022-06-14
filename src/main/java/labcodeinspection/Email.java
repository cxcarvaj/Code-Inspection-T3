package labcodeinspection;

import java.util.Locale;

public class Email {

	private String m_firstName;
	private String m_lastName;
	private String password;
	private String department;
	private int defaultpasswordLength = 8;
	private String email;

	/**
	* 
	*
	* @author Team3
	* @param firstName
	* @param lastName
	*/
	public Email(String firstName, String lastName) {
		this.m_firstName = firstName;
		this.m_lastName = lastName;
	}

	/**
	* 
	*
	* @author Team3
	*/
	public void showInfo() {
		System.out.println("\nFIRST NAME= " + m_firstName + "\nLAST NAME= " + m_lastName);
		System.out.println("DEPARMENT= " + department + "\nEMAIL= " + email + "\nPASSWORD= " + password);
	}

	/**
	* 
	*
	* @author Team3
	* @param depChoice
	*/
	public void setDeparment(int depChoice) {
		switch (depChoice) {
		case 1:
			this.department = "sales";
			break;
		case 2:
			this.department = "dev";
			break;
		case 3:
			this.department = "acct";
			break;
		default:
			break;
		}
	}

	private String randomPassword(int length) {
		String set = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890#$&@*";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * set.length());
			password[i] = set.charAt(rand);
		}
		return new String(password);
	}
	
	/**
	* 
	*
	* @author Team3
	*/
	public void generateEmail() {
		this.password = this.randomPassword(this.defaultpasswordLength);
		this.email = this.m_firstName.toLowerCase(Locale.US) + this.m_lastName.toLowerCase(Locale.US) + "@" + this.department
				+ ".espol.edu.ec";
	}
	
	/**
	* 
	*
	* @author Team3
	* @param m_firstName
	*/
	public void setM_firstName(String m_firstName){
	      this.m_firstName = m_firstName;
	}

	/**
	* 
	*
	* @author Team3
	* @return m_firstName
	*/
	public String getM_firstName(){
	      return this.m_firstName;
	}
	
	/**
	* 
	*
	* @author Team3
	* @param m_lastName
	*/
	public void setM_lastName(String m_lastName){
	      this.m_lastName = m_lastName;
	}

	/**
	* 
	*
	* @author Team3
	* @return m_lastName
	*/
	public String getM_lastName(){
	      return this.m_lastName;
	}
	
	/**
	* 
	*
	* @author Team3
	* @param password
	*/
	public void setPassword(String password){
	      this.password = password;
	}

	/**
	* 
	*
	* @author Team3
	* @return password
	*/
	public String getPassword(){
	      return this.password;
	}
	
	public void setDepartment(String department){
	      this.department = department;
	}

	public String getDepartment(){
	      return this.department;
	}
	
	public void setDefaultpasswordLength(int defaultpasswordLength){
	      this.defaultpasswordLength = defaultpasswordLength;
	}

	public int getDefaultpasswordLength(){
	      return this.defaultpasswordLength;
	}
	
	public void setEmail(String email){
	      this.email = email;
	}

	public String getEmail(){
	      return this.email;
	}
	
}
