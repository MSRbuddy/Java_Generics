import java.util.Scanner;

// Extended this class with MaximumGenerics3 class
public class GenericsMaxUC3 extends MaximumGenerics3
{
    // Scanner Class for user input
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("***** Maximum of three strings *****");
        System.out.println("Enter 3 String values : ");
        // Taking 3 String values from user
        String str1 = scanner.next();
        String str2 = scanner.next();
        String str3 = scanner.next();
        System.out.println("Maximum is : " + findStringMax(str1, str2, str3));
    }
}

class MaximumGenerics3
{
    public static String findStringMax(String str1, String str2, String str3)
    {
        String max = str1;
        if (str2.compareTo(max) > 0 && str2.compareTo(str3) > 0)
            max = str2;
        else if (str3.compareTo(max) > 0)
            max = str3;
        return max;
    }
}