package collections_problems;

import java.util.ArrayList;
import java.util.function.Supplier;

public class PrimeSupplier {
    public static void main(String[] args) {
       
        Supplier<ArrayList<Integer>> primeSupplier = () -> {
            ArrayList<Integer> primes = new ArrayList<>();
            int num = 2;
            while (primes.size() < 10) {
                if (isPrime(num)) {
                    primes.add(num);
                }
                num++;
            }
            return primes;
        };

        
        ArrayList<Integer> primeList = primeSupplier.get();

        
        System.out.println("First 10 prime numbers:");
        for (int prime : primeList) {
            System.out.println(prime);
        }
    }

   
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
