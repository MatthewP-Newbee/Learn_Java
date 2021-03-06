package stackTrace;

import java.util.*;

public class StackTraceTest {
    public static int factotial(int n)
    {
        System.out.println("Factorial("+ n +"):");
        Throwable t = new Throwable();
        StackTraceElement[] frames = t.getStackTrace();
        for (StackTraceElement f : frames)
            System.out.println(f);
        int r;
        if (n <= 1) r = 1;
        else r = n * factotial(n - 1);
        System.out.println("return " + r);
        return r;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        factotial(n);
    }
}
