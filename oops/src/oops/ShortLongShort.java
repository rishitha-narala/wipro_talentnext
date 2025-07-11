package oops;
import java.util.*;
public class ShortLongShort {
    public static String combineStrings(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static void main(String[] args) {
        // Example 1
        String str1 = "hi";
        String str2 = "hello";
        String result = combineStrings(str1, str2);
        System.out.println("Output: " + result);  // hihellohi

        // Example 2
        String str3 = "abc";
        String str4 = "z";
        System.out.println("Output: " + combineStrings(str3, str4));  // zabcz
    }
}