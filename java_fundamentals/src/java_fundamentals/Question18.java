package java_fundamentals;
import java.util.*;

public class Question18 {

	public static void main(String[] args) 
	{
		int rows = 3;
		for (int i = 1; i <= rows; i++) 
		{     
            for (int j = 1; j <= i; j++) 
            {    
                System.out.print("* ");
            }
            System.out.println();
		}

	}

}