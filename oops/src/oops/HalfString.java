package oops;

public class HalfString {
    public static String getFirstHalf(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(0, str.length() / 2);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        
        String input1 = "TomCat";
        String result1 = getFirstHalf(input1);
        System.out.println("Input: " + input1);
        System.out.println("Output: " + result1);

        
        String input2 = "Apron";
        String result2 = getFirstHalf(input2);
        System.out.println("Input: " + input2);
        System.out.println("Output: " + result2);
    }
}