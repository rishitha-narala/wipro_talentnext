package oops;
import java.util.*;

public class RemoveStars {
    public static String removeStarAndNeighbors(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            // If current char is '*' or next to '*', skip it
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
        // Example 1
        String input1 = "ab*cd";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + removeStarAndNeighbors(input1)); // Output: ad

        // Example 2
        String input2 = "ab**cd";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + removeStarAndNeighbors(input2)); // Output: ad

        // Example 3
        String input3 = "a*b*c";
        System.out.println("Input: " + input3);
        System.out.println("Output: " + removeStarAndNeighbors(input3)); // Output: (empty)

        // Example 4
        String input4 = "hello*world";
        System.out.println("Input: " + input4);
        System.out.println("Output: " + removeStarAndNeighbors(input4)); // Output: hellrld
    }
}
