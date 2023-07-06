import java.util.Scanner;

// Extended this class with MaximumGenerics class
public class GenericsMaxUC1 extends MaximumGenerics
{
    // Scanner Class for user input
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("***** Maximum of three integer numbers *****");
        System.out.println("Enter 3 numbers: ");
        // Taking 3 numbers from user
        Integer x = scanner.nextInt();
        Integer y = scanner.nextInt();
        Integer z = scanner.nextInt();
        System.out.println("Maximum is : " + maximum(x, y, z));
    }
}

class MaximumGenerics
{
    public static int maximum(Integer x, Integer y, Integer z)
    {
        Integer max = x;
        if (y.compareTo(max) > 0 && y.compareTo(z) > 0)
            max = y;
        else if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
}