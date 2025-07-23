package collections_problems;

import java.util.ArrayList;
import java.util.function.Consumer;

public class OddEvenConsumer {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(11);
        numbers.add(4);
        numbers.add(7);
        numbers.add(10);
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);

       
        Consumer<Integer> printOddEven = number -> {
            String type = (number % 2 == 0) ? "even" : "odd";
            System.out.println(number + " " + type);
        };

       
        numbers.forEach(printOddEven);
    }
}
