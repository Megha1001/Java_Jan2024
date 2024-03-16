package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class EvenComesFirstComparable {
    public static void main(String[] args) {
        Integer arr[] = {2,3,4,5,6};
        System.out.println("Input array after comparator");
        Arrays.sort(arr, new MyCmp());
        // Displaying the sorted array
        System.out.println(Arrays.toString(arr));
    }
}

// This class implements
// Comparator interface to compare
class MyCmp implements Comparator<Integer>
{
    // Sorts the Integers
    public int compare(Integer a, Integer b)
    {
        return a%2 - b%2;
    }
}
