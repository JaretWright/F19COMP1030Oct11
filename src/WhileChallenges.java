public class WhileChallenges {
    public static void main(String[] args)
    {
        System.out.printf("Challege 1 = Count to 10 in steps of 2%n");
        int counter = 2;

        while(counter <=10)
        {
            System.out.println(counter);
            //counter = counter + 2;
             counter += 2;   //this is the same as the previous line
        }

        System.out.printf("%n%nChallenge 2 = Display my name 5 times%n");
        counter =1;

        while (counter <= 5)
        {
            System.out.println("my name is Jaret");
            counter++;
        }

        System.out.printf("%n%nChallege 3 = Display name with #'s%n");
        counter = 1;

        while (counter <= 100)
        {
            System.out.printf("%3d. Jaret%n", counter);
            counter++;
        }
    }
}
