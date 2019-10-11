public class EvenOrOddChallenge {
    public static void main(String[] args)
    {
        //display the numbers 1-10 on the screen with "even" or "odd" beside each number
        for(int i=1; i<=10; i++)
            System.out.printf("%2d. %s%n", i, evenOrOdd(i));
    }

    public static String evenOrOdd(int num)
    {
        if (num%2 == 0)
            return "even";
        else
            return "odd";
    }
}

