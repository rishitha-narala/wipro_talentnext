package collections_problems;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeFilter {
    public static void main(String[] args) {
        
        ArrayList<String> words = new ArrayList<>();
        words.add("madam");
        words.add("hello");
        words.add("level");
        words.add("world");
        words.add("noon");
        words.add("java");
        words.add("civic");
        words.add("code");
        words.add("deed");
        words.add("kayak");

        
        Predicate<String> isPalindrome = word -> {
            String reversed = new StringBuilder(word).reverse().toString();
            return word.equalsIgnoreCase(reversed);
        };

        
        List<String> palindromeWords = words.stream()
                                            .filter(isPalindrome)
                                            .collect(Collectors.toList());

        
        System.out.println("Palindrome words:");
        for (String word : palindromeWords) {
            System.out.println(word);
        }
    }
}
