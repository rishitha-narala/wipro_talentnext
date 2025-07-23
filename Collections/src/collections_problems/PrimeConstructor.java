package collections_problems;

import java.util.*;

@FunctionalInterface
interface PrimeCheck {
    void checkPrime(int number);
}

public class PrimeConstructor {
    PrimeConstructor(int number) {
        if (isPrime(number))
            System.out.println(number + " is Prime");
        else
            System.out.println(number + " is Not Prime");
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeCheck p = PrimeConstructor::new;
        p.checkPrime(17);  // Change number here to test
    }
}
