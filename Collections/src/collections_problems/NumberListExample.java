package collections_problems;
import java.util.*;

public class NumberListExample {

	public static void main(String[] args) {
		ArrayList<Number> numberList = new ArrayList<>();

       
        numberList.add(10);        
        numberList.add(3.14);      
        numberList.add(2.5f);      
        numberList.add(100L);      

        
        System.out.println("Numbers in the list:");
        for (Number num : numberList) {
            System.out.println(num);
        }
    }


	}


