package arrays;
import java.util.*;

public class Arrays9 {

	public static void main(String[] args) {
		int[] arr = {10, 2, 10}; 
        int[] result = withoutTen(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int num : nums) {
            if (num != 10) {
                result[index] = num;
                index++;
            }
        }
        return result;

	}

}