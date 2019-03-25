/**
 * Selection Sort - sorts in descending order
 */
package selectionsort;

/**
 * 
 * @author Producer
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {67, 78, 4, 15, 47, 30, 99, 33, 65, 85};
        SelectionSort(numbers);
        for (int i = 0; i<numbers.length; i++)
        {
            System.out.print(numbers[i]+"\t");
        }
    }
    public static void SelectionSort (int[] num)
    {
        int i, j, first, temp;
        for (i=num.length - 1; i > 0; i--)
        {
            first = 0;   //initialize to subscript of first element
            for(j = 1; j <= i; j++)   //locate smallest element between 1 and i
            {
                if(num[j] < num[first])
                    first = j;
            }
            temp = num[first];   //swap smallest found with element in position i
            num[first] = num[i];
            num[i] = temp;
        }
    }
  
}
