package arrays;
import java.util.*;

public class Arrays12 {

	public static void main(String[] args) {
		int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        
        int[] result = middleWay(a, b);
        
        System.out.print("[" + result[0] + ", " + result[1] + "]");
    }

    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};

	}

}