
public class Main {
	
	public static void main(String[] args) {
		Person person = new Person();
		
		System.out.println("Gender:\t\t" + person.gender);
		System.out.println("Name:\t\t" + person.firstName + " " + person.lastName);
		System.out.println("Birth Date:\t" + person.birthDate);
		System.out.println("Eye Color:\t" + person.eyeColor);
		System.out.println("Hair Color:\t" + person.hairColor);
		System.out.println("Nationality:\t" + person.nationality);
		System.out.println("Email-Address:\t" + person.emailAddress);
		System.out.println("Tel. Number:\t" + person.telephoneNumber);
		System.out.println("Job:\t\t" + person.job);
		System.out.println("Address:\t" + person.address);
		System.out.println("City:\t\t" + person.city);
	}
}
