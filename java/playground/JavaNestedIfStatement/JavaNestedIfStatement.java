import java.util.Scanner;

public class JavaNestedIfStatement
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt(); //reads int input

        if(age >= 18) {
            System.out.println("You are qualified to vote!");
        }
        else if(age < 0) {
            System.out.println("The age you entered is invalid!");
        }
        else {
            System.out.println("You are too young to vote!");
        }
    }
}
