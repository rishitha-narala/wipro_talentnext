package java_fundamentals;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n/2 == 0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}

	}

}