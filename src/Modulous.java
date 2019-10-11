import java.util.Scanner;

public class Modulous {
    public static void main(String[] args)
    {
        System.out.printf("using integers 5/3=%d%n",5/3);
        System.out.printf("using integers 5/2=%d%n",5/2);
        System.out.printf("using doubles 5/2=%.1f%n", (double) 5/2);

        //to find the remainder in integer division, we use modulus %
        System.out.printf("using integers 5/2=%d with a remainder of %d%n",5/2, 5%2);

        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int num = keyboard.nextInt();
        System.out.printf("%d is %s", num, evenOrOdd(num));
    }

    public static String evenOrOdd(int num)
    {
        if (num%2 == 0)
            return "even";
        else
            return "odd";
    }
}
