
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
	String companyName = null;
	String salary = null;
	
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
		this.companyName = rg.getRandCompanyName();
		this.salary = rg.getRandSalary();
	}

	@Override
	public String toString(){
		return "Gender:\t\t\t" + this.gender +
		"\nName:\t\t\t" + this.firstName + " " + this.lastName +
		"\nBirth Date:\t\t" + this.birthDate +
		"\nEye Color:\t\t" + this.eyeColor +
		"\nHair Color:\t\t" + this.hairColor +
		"\nNationality:\t" + this.nationality +
		"\nEmail-Address:\t" + this.emailAddress +
		"\nTel. Number:\t" + this.telephoneNumber +
		"\nJob:\t\t\t" + this.job +
		"\nAddress:\t\t" + this.address +
		"\nCity:\t\t\t" + this.city +
		"\nCompany Name:\t" + this.companyName +
		"\nSalary:\t\t\t" + this.salary + "\n";
	}

	public String getAsCSV(){
		return this.gender +
				"," + this.firstName +
				"," + this.lastName +
				"," + this.birthDate +
				"," + this.eyeColor +
				"," + this.hairColor +
				"," + this.nationality +
				"," + this.emailAddress +
				"," + this.telephoneNumber +
				"," + this.job +
				"," + this.address +
				"," + this.city +
				"," + this.companyName +
				"," + this.salary +";";
	}
}
