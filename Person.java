
public class Person {
	String gender = null;
	String firstName = null;
	String lastName = null;
	String birthDate = null;
	String eyeColor = null;
	String hairColor = null;
	String nationality = null;
	String emailAddress = null;
	String telephoneNumber = null;
	String job = null;
	String address = null;
	String city = null;
	
	Person(){
		RandomGenerator rg = new RandomGenerator();
		
		this.gender = rg.getRandGender();
		this.firstName = rg.getRandFirstName(gender);
		this.lastName = rg.getRandLastName();
		this.birthDate = rg.getRandBirthDate();
		this.eyeColor = rg.getRandEyeColor();
		this.hairColor = rg.getRandHairColor();
		this.nationality = rg.getRandNationality();
		this.emailAddress = rg.getRandEmailAddress(firstName, lastName);
		this.telephoneNumber = rg.getRandTelephoneNumber();
		this.job = rg.getRandJob();
		this.address = rg.getRandAddress();
		this.city = rg.getRandCity();
	}
}
