import javax.swing.JOptionPane;

public class JavaOptPane
{
    public static void main(String args[])
    {
        //Display an input dialog to the user
        //then place his response in the 'name' variable
        String name = JOptionPane.showInputDialog("Enter your name: ");
        
        //Display a message with the name in a message dialog
        String msg = "Hello " + name + "!";
        JOptionPane.showMessageDialog(null,msg);
    }
}