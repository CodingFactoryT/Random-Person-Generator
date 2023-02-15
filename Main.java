import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("How many persons would you like to generate?");
		Scanner scanner = new Scanner(System.in);
		while(!scanner.hasNextInt()){
			System.out.println("Please input an integer value:");
			scanner.nextLine();
		}

		int count = scanner.nextInt();
		
		for(int i = 0; i < count; i++){
			Person person = new Person();
			//System.out.println(person);
			System.out.println(person.getAsCSV());
		}
	}
}
