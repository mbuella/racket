import java.util.Scanner;

public class JavaScanner
{
    public static void main(String args[])
    {
        //Create new instance of Scanner class
        Scanner scan = new Scanner(System.in);
        
        //Print the instruction message
        System.out.print("Enter your name: ");
        
        //Display an "invisible" field which the user/s
        //can enter their name, which will be placed inside
        //the 'name' variable:
        String name = scan.nextLine();
        
        //Print out the message with name
        System.out.println("Your name is " + name);
    }
}