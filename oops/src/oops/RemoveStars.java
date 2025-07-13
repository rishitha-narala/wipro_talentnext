package oops;
import java.util.*;

public class RemoveStars {
    public static String removeStarAndNeighbors(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
           
            if (str.charAt(i) == '*') {
                continue;
            }
            if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            }
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                continue;
            }
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        
        String input1 = "ab*cd";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + removeStarAndNeighbors(input1)); 

        
        String input2 = "ab**cd";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + removeStarAndNeighbors(input2)); 
       
        String input3 = "a*b*c";
        System.out.println("Input: " + input3);
        System.out.println("Output: " + removeStarAndNeighbors(input3)); 

        
        String input4 = "hello*world";
        System.out.println("Input: " + input4);
        System.out.println("Output: " + removeStarAndNeighbors(input4)); 
    }
}
