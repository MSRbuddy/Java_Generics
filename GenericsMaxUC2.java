import java.util.Scanner;

// Extended this class with MaximumGenerics2 class
public class GenericsMaxUC2 extends MaximumGenerics2
{
    // Scanner Class for user input
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("***** Maximum of three float numbers *****");
        System.out.println("Enter 3 Float values :");
        // Taking 3 Float values from user
        Float x = scanner.nextFloat();
        Float y = scanner.nextFloat();
        Float z = scanner.nextFloat();
        System.out.println("Maximum is : " + maxfloat(x, y, z));
    }
}

class MaximumGenerics2
{
    public static Float maxfloat(Float x, Float y, Float z)
    {
        Float max = x;
        if (y.compareTo(max) > 0 && y.compareTo(z) > 0)
            max = y;
        else if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
}