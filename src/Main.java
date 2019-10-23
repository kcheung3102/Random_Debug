import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        output("Generate 10 random integers between 1 and 6");
        Random rnd = new Random();
        int low = 1;
        int high = 6;
        for (int i = 1; i <= 10; ++i)
        {
            int randomInt = rnd.nextInt(high - low) + low;
            output("Generated number: " + randomInt);
        }

        output("Done.");
    }

    private static void output(String aMessage)
    {
        System.out.println(aMessage);
    }
}

