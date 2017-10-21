import java.util.Scanner;

public class JavaIfStatement
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int age = scan.nextInt();  //reads int input

		if(age >= 18) {
			System.out.println("You are qualified to vote!");
		}
	}
}
