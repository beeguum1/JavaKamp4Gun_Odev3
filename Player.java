package gameDemo;

public class Player {
	private String nationalId;
	private String firstName;
	private String lastName;
	private String yearOfBirth;
	

	public Player() {
		
	}


	public Player(String nationalId, String firstName, String lastName, String yearOfBirth) {
		super();
		this.nationalId = nationalId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearOfBirth = yearOfBirth;
	}


	public String getNationalId() {
		return nationalId;
	}


	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
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


	public String getYearOfBirth() {
		return yearOfBirth;
	}


	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	

	
	
	
	
	
	
	
	
	
	
	
}

