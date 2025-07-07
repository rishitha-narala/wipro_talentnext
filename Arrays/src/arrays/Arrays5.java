package arrays;
import java.util.*;

public class Arrays5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Smallest two numbers: " + arr[0] + ", " + arr[1]);

        System.out.println("Largest two numbers: " + arr[n - 2] + ", " + arr[n - 1]);


	}

}