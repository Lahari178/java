package exercises;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] array) {
        Set<Integer> uniqueElements = new HashSet<>();
        
        for (int element : array) {
            uniqueElements.add(element);
        }
        
        int[] result = new int[uniqueElements.size()];
        int index = 0;
        for (int element : uniqueElements) {
            result[index++] = element;
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 1, 6, 3, 7};
        System.out.println("Original array: " + Arrays.toString(array));
        
        int[] arrayWithoutDuplicates = removeDuplicates(array);
        System.out.println("Array without duplicates: " + Arrays.toString(arrayWithoutDuplicates));
    }
}
