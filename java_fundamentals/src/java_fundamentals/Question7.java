package java_fundamentals;
import java.util.*;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        String nStr = sc.nextLine();  // take number of values as String

        // Convert string to integer
        int n = Integer.parseInt(nStr);

        if (n == 0) {
            System.out.println("No values");
        } else {
            String[] values = new String[n];

            System.out.println("Enter " + n + " values:");
            for (int i = 0; i < n; i++) {
                values[i] = sc.nextLine();
            }

            for (int i = 0; i < n; i++) {
                if (i == n - 1) {
                    System.out.print(values[i]);
                } else {
                    System.out.print(values[i] + ", ");
                }
            }
        }

        sc.close();
    }
}
