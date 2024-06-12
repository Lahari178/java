package exercises;
import java.util.*;
public class DuplMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		        int[] arr = {1, 2, 3, 4, 4, 5, 6, 6, 7};
		        int[] uniqueArr = removeDuplicates(arr);
		        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArr));
		    }

		    public static int[] removeDuplicates(int[] arr) {
		        Arrays.sort(arr);
		        
		        int j = 0;
		        
		        for (int i = 0; i < arr.length - 1; i++) {
		            if (arr[i] != arr[i + 1]) {
		                arr[j++] = arr[i];
		            }
		        }

		        arr[j++] = arr[arr.length - 1];
		        
		        int[] uniqueArray = new int[j];
		        
		        for (int k = 0; k < j; k++) {
		            uniqueArray[k] = arr[k];
		        }
		        
		        return uniqueArray;
		    }
		}