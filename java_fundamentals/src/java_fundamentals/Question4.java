package java_fundamentals;
import java.util.*;
public class Question4 {

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0)
        {
        	System.out.println("The number is positive");
        }
        else if (a < 0)
        {
        	System.out.println("The number is negative");
        }
        else
        {
        	System.out.println("The number is zero");
        }
	}

}
