package binary;
import java.util.Arrays;

/**
 *
 * @author Producer
 */
public class Binary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {67, 78, 4, 15, 47, 30, 99, 33, 65, 85};
        Arrays.sort(numbers);//sort the array, binary search requires a sorted array
        binarySearch(numbers,0,numbers.length,30);//found
        binarySearch(numbers,0,numbers.length,31);//not found
    }
    public static void binarySearch(int[] array, int lowerbound,
            int upperbound, int key) {
        int position;
        // To start, find the subscript of the middle position.
        position = ( lowerbound + upperbound) / 2;
        while((array[position] != key) && (lowerbound <= upperbound))
        {
            if (array[position] > key)
            {
                 upperbound = position - 1;
            }
            else
            {
                lowerbound = position + 1;
            }
            position = (lowerbound + upperbound) / 2;
        }
        if (lowerbound <= upperbound)
        {
            System.out.println("The number was found in array at position: " + position);
        }
        else
        {
            System.out.println("Sorry, the number is not in this array.");
        }
    }
}
