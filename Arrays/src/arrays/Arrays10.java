package arrays;
import java.util.*;

public class Arrays10 {

	public static void main(String[] args) {
		int[] arr = {3, 3, 2}; 
        int[] result = evenOdd(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[start] = num;
                start++;
            } else {
                result[end] = num;
                end--;
            }
        }

        return result;

	}

}