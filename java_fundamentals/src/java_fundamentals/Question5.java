package java_fundamentals;
import java.util.*;
public class Question5 {

	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   int a1 = sc.nextInt();
	   int a2 = sc.nextInt();
	   if (a1 % 10 == a2 % 10)
	   {
		   System.out.println("True");
	   }
	   else
	   {
		   System.out.println("False");  
	   }

	}

}
