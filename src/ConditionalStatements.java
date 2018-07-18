import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value between 1 and 100: ");

		int userInt = scan.nextInt();
		

		if (userInt >= 1 && userInt <= 59 && (userInt & 1) != 0) {
			System.out.println(userInt + " and Odd");

		} else if (userInt >= 2 && userInt <= 25 && userInt % 2 == 0) {
			System.out.println(userInt + " Even and less than 25");

		} else if (userInt >= 26 && userInt <= 60 && userInt % 2 == 0) {
			System.out.println("Even");

		} else if (userInt >= 62 && userInt <= 100 && userInt % 2 == 0) {
			System.out.println(userInt + " and Even");

		} else if (userInt >= 61 && userInt <= 99 && (userInt & 1) != 0) {
			System.out.println(userInt + " Odd and over 60");

		} else {
			System.out.println("Value is out of range - Please enter a value between 1 and 100.");
		}
		scan.close();

	}

}
