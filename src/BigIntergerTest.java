import java.math.*;
import java.util.*;

/**
 * This program uses big unmbers to compute the odds of winnig the grand prize in a lottery.
 * @author: MatthewP
 */

public class BigIntergerTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers do you need to draw?");
        int n = in.nextInt();

        BigInteger lottoryOdds = BigInteger.valueOf(1);

        for (int i = 1; i <= k; i++)
            lottoryOdds = lottoryOdds.multipl(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));

        System.out.println("Your odds are 1 in " + lottoryOdds + ". Good Luck!");
    }
}