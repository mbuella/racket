import java.util.Scanner;

public class JavaSwitchStatement
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
		
        System.out.println("Welcome to Number to Words Converter!");
        System.out.print("Enter any number: ");
        int number = scan.nextInt();  //reads int input
		
        switch(number) {
            case 1: System.out.println("One");
                break;
            case 2: System.out.println("Two");
                break;
            case 3: System.out.println("Three");
                break;
            case 4: System.out.println("Four");
                break;
            case 5: System.out.println("Five");
                break;
            case 6: System.out.println("Six");
                break;
            case 7: System.out.println("Seven");
                break;
            case 8: System.out.println("Eight");
                break;
            case 9: System.out.println("Nine");
                break;
        }
    }
}

