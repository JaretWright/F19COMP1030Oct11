import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args)
    {
        //ask the user for the password
        System.out.printf("Enter a password: ");

        //store the password in a variable
        Scanner keyboard = new Scanner(System.in);
        String pw = keyboard.nextLine();

        //check if it is valid
        while (!pw.equals("turkeyTime"))
        {
            System.out.printf("That password was invalid.  Enter another:");
            pw=keyboard.nextLine();
        }

        //if it is not valid as for the password again
        //tell the user they entered a valid password
        System.out.printf("Success");

        System.out.printf("%nNow with a do...while loop%n");
        do {
            System.out.printf("Enter a password");
            pw = keyboard.nextLine();
        } while (!pw.equals("dessert"));

        System.out.printf("You earned a break%n");
    }
}
