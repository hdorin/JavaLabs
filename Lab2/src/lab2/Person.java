package lab2;
/**
 * Is an abstract class which is derived in Stundent.java
 * @param teachers the list of students involved in the project
 */
abstract class Person {
	
	private String name, email;

	/**
	 * Class constructor 
	 * @param name
	 * @param email
	 */
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}
	
	/**
	 * Getter for the variable name of type String
	 * @return name the name of the person 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Getter for the variable email of type String
	 * @return email the email of the person
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Setter for the variable name of type String
	 * @param name the name of the person
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setter for the variable email of type String
	 * @param email the email of the person
	 */
	public void setEmail(String email) {
		this.email = email;

	}
}