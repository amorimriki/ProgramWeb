package Book_Essay3;

public class Author {

		// data members
	private String name;
	private String email;
	private char gender;
	
	public Author (String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	//methods (getters)
	public String getName() {return name;}
	public String getEmail() {return email;}
	public char getGender() {return gender;}
	
	//set the email
	public void setEmail (String email) {this.email = email;	}
	// return self-description
	public String toString() {
		if (this.gender == 'M') return (name +" homem "+email);
		else if (this.gender == 'F') return (name +" mulher "+email);
	return null;
	}




}
