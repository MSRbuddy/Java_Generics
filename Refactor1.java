public class Refactor1
{
    public static void main(String[] args)
    {
        // initializing the values and finding the maximum
        System.out.println("Maximum of Integers is : "+ MaximumGenericsRF1.toPrintMax(10,25,18));
        System.out.println("Maximum of Float is : " + MaximumGenericsRF1.toPrintMax(10.7f,20.4f,37.7f));
        System.out.println("Maximum of Strings is : " + MaximumGenericsRF1.toPrintMax("Mango","Banana","Apple"));
    }
}

class MaximumGenericsRF1<T extends Comparable<T>>
{
    public static <T extends Comparable<T>> T toPrintMax(T x, T y, T z)
    {
        T max = x;
        if (y.compareTo(max) > 0 && y.compareTo(z) > 0)
        {
            max = y;
        }
        if (z.compareTo(max) > 0)
        {
            max = z;
        }
        return max;
    }
}