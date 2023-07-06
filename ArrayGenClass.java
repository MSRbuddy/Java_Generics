public class ArrayGenClass<T>
{
    private T[] inputArray;

    public ArrayGenClass(T[] inputArray)
    {
        this.inputArray = inputArray;
    }

    public static <E> void toPrint(E[] inputArray)
    {
        for(E element : inputArray)
        {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Integer[] intArray = {1, 3, 5, 7, 9};
        Double[] doubleArray = {1.2, 2.3, 4.5, 6.7, 8.9};
        Character[] charArray = {'A', 'E', 'I','O', 'U'};

        PrintArray.toPrint(intArray);
        PrintArray.toPrint(doubleArray);
        PrintArray.toPrint(charArray);
    }
}
