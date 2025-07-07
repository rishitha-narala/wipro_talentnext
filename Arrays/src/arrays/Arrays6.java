package arrays;
import java.util.*;

public class Arrays6 {

	public static void main(String[] args) {
		int[] numbers = {5, 2, 9, 1, 7};

        Arrays.sort(numbers);

 
        System.out.println("Sorted Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        

	}

}