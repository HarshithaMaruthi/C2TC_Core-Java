import java.util.Scanner;

public class Mainn {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			int age= sc.nextInt();
			long mobileno= sc.nextLong();
			double cgpa= sc.nextDouble();
			char gender= sc.next().charAt(0);
			System.out.println("Name:" +name );
			System.out.println("age:" +age);
			System.out.println("mobileno:" +mobileno);
			System.out.println("cgpa:" +cgpa);
			System.out.println("gender:" +gender);

	}

}
