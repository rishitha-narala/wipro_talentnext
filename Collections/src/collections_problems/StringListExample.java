package collections_problems;
import java.util.*;

public class StringListExample {

	
		public static void main(String[] args) {
	        
	        ArrayList<String> stringList = new ArrayList<>();

	        
	        stringList.add("Hello");
	        stringList.add("World");
	        stringList.add("Java");
	        stringList.add("Programming");

	      
	        printAll(stringList);
	    }


	    public static void printAll(ArrayList<String> list) {
	        Iterator<String> iterator = list.iterator();
	        System.out.println("Elements in the list:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	}

}
