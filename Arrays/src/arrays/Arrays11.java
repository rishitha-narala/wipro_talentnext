package arrays;
import java.util.*;

public class Arrays11 {

	public static void main(String[] args) {
		int[] arr = {1, 4, 1, 4}; 
        System.out.println(only14(arr));
    }

    public static boolean only14(int[] nums) {
        for (int num : nums) {
            if (num != 1 && num != 4) {
                return false;
            }
        }
        return true;

	}

}