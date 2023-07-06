public class GenericsMaxUC4
{
    public static void main(String[] args)
    {
        // initializing the values and finding the maximum
        System.out.println("Maximum of Integers is : " + MaximumGenerics4.toPrintMax(10, 20, 18, 25));
        System.out.println("Maximum of Float is : " + MaximumGenerics4.toPrintMax(10.7f, 20.4f, 17.7f, 9.99f));
        System.out.println("Maximum of Strings is : " + MaximumGenerics4.toPrintMax("StrawBerry", "Mango", "Banana", "Cherry"));
    }
}

class MaximumGenerics4<T extends Comparable<T>>
{

    public static <T extends Comparable<T>> T toPrintMax(T w, T x, T y, T z)
    {
        T max = w;
        if (x.compareTo(max) > 0 && x.compareTo(y) > 0 && x.compareTo(z) > 0)
        {
            max = x;
        }
        if (y.compareTo(max) > 0 && y.compareTo(x) > 0 && x.compareTo(z) > 0)
        {
            max = y;
        }
        if (z.compareTo(max) > 0 && z.compareTo(x) > 0 && z.compareTo(y) > 0)
        {
            max = z;
        }
        return max;
    }
}