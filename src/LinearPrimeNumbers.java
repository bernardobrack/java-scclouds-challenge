import java.util.ArrayList;
import java.util.HashSet;

public class LinearPrimeNumbers {

    public static ArrayList<Integer> calculate(Integer n) {
        if(n<=1) return new ArrayList<>();
        ArrayList<Integer> primeNumbersArray = new ArrayList<>();
        HashSet<Integer> nonPrimeNumbers = new HashSet<>();
        for(int i=2; i<=n;i++) {
            if(nonPrimeNumbers.contains(i)) continue;
            if(isPrime(i)) {
                primeNumbersArray.add(i);
            }
            for(int j=2*i; j<=n;j+=i) {
                nonPrimeNumbers.add(j);
            }

        }
        return primeNumbersArray;
    }
    private static boolean isPrime(Integer n) {
        if(n<=1) return false;
        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
