package arrays;
import java.util.*;

public class Arrays14 {
	public static void main(String[] args) {
			 Scanner sc=new Scanner(System.in);
			 int [][]arr=new int[3][3];
			 System.out.println("Enter the elements: ");
			 
			 for(int i=0;i<3;i++) {
	    		   for(int j=0;j<3;j++) {
	    			   arr[i][j]=sc.nextInt();
	}
	}
	    	   int max=arr[0][0];
	    	   for(int i=0;i<3;i++) {
	    		   for(int j=0;j<3;j++) {
	    			   if(arr[i][j]>max) {
	    				   max=arr[i][j];
	    			   }
	    		   }
	    	   }
	    	   System.out.println(max);
		 }
	}