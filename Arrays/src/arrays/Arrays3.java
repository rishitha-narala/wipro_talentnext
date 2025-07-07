package arrays;
import java.util.*;
public class Arrays3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 4, 34, 56, 7};
		int num = sc.nextInt();
		
		boolean found = false;
		
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i] == num)
			{
				found = true;
				break;
			}
		}
		if (found)
		{
			System.out.println(num + " is present in the array.");
		}
		else
		{
			System.out.println(num + " is not present in the array.");
		}

	}

}
