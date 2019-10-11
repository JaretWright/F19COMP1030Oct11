public class EvenOddChallengeSmall {
    public static void main(String[] args)
    {
        for (int i=1; i<=10; i++)
            System.out.printf("%2d. %s%n", i, (i%2==0)?"even":"odd");
    }
}
