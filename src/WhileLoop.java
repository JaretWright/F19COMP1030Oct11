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
        if (pw.equals("turkeyTime"))
            System.out.printf("Success");
        else
            System.out.printf("Wrong password");

        //if it is not valid as for the password again
        //tell the user they entered a valid password
    }
}
