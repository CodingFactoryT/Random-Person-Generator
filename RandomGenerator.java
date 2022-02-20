import java.time.LocalDate;
import java.util.Random;

import Data.*;

public class RandomGenerator {
	static Random random = new Random();
	
	public <T extends Enum<T>> String randStringOf(T[] enumValues) {
		int x = random.nextInt(enumValues.length);
		return enumValues[x].toString();
	}
	
	public String getRandGender() {
		return randStringOf(Genders.values());
	}
	
	public String getRandFirstName(String gender){
		if(gender.equals("Male")) return randStringOf(FirstNames_Male.values()).toString();
		if(gender.equals("Female")) return randStringOf(FirstNames_Female.values()).toString();
		return null;
	}
	
	public String getRandLastName() {
		return randStringOf(LastNames.values()).toString();
	}
	
	public String getRandBirthDate() {
		LocalDate ld = LocalDate.now();
		int currentYear = ld.getYear();
		int maxAge = 100;
		
		int day = 0;
		int month = random.nextInt(12)+1;
		int year = random.nextInt(maxAge) + currentYear-maxAge;
		
		if(month % 2 != 0) day = random.nextInt(31)+1;
		if(month % 2 == 0 && month != 2) day = random.nextInt(30)+1;
		if(month == 2) day = random.nextInt(28)+1;
		
		return day + "." + month + "." + year;
	}
	
	public String getRandEyeColor() {
		int x = random.nextInt(100);
		if(x < 77) return EyeColors.Brown.toString();		//77% chance
		else if(x < 87) return EyeColors.Blue.toString();	//10% chance
		else if(x < 92) return EyeColors.Hazel.toString();	// 5% chance
		else if(x < 97) return EyeColors.Amber.toString();	// 5% chance
		else if(x < 99) return EyeColors.Green.toString();	// 2% chance
		else if(x < 100) return EyeColors.Gray.toString();	// 1% chance
		return null;
	}
	
	public String getRandHairColor() {
		int x = random.nextInt(100);
		if(x < 84) return HairColors.Black.toString();			//84% chance
		else if(x < 95) return HairColors.Brown.toString();		//11% chance
		else if (x < 98) return HairColors.Blonde.toString(); 	// 3% chance
		else if(x < 100) return HairColors.Red.toString();		// 2% chance
		return null;
	}
	
	public String getRandNationality() {
		return randStringOf(Nationalities.values()).toString();
	}
	
	public String getRandEmailAddress(String firstName, String lastName) {
		String emailProvider = randStringOf(EmailDomains.values()).toString();
		return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + emailProvider + ".com";
	}
	
	public String getRandTelephoneNumber() {
		String number = "";
		for(int i = 0; i < 12; i++) {
			number += random.nextInt(10);
			if(i == 3) number += " ";
		}
		return number;
	}
	
	public String getRandJob() {
		return randStringOf(Jobs.values()).toString();
	}
	
	public String getRandAddress() {
		int houseNumber = random.nextInt(100);
		int x = random.nextInt(7);
		String additional = "";
		
		switch(x) {
		case 0: additional = "Street"; break;
		case 1: additional = "Road"; break;
		case 2: additional = "Place"; break;
		case 3: additional = "Park"; break;
		case 4: additional = "Hill"; break;
		case 5: additional = "Gardens"; break;
		case 6: additional = "Lane"; break;
		}
		
		String city = randStringOf(Cities.values()).toString();
		return randStringOf(StreetNames.values()).toString() + " " + additional + " " + houseNumber;
	}
	
	public String getRandCity() {
		return randStringOf(Cities.values()).toString();
	}
	
}
