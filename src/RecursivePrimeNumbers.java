import java.util.ArrayList;
import java.util.HashSet;

public class RecursivePrimeNumbers {


    public static ArrayList<Integer> calculate(Integer n) {
        if(n<=1) return new ArrayList<>();
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        HashSet<Integer> nonPrimeNumbers = new HashSet<>();
        return calculate(n, 2, primeNumbers, nonPrimeNumbers);
    }
    private static ArrayList<Integer> calculate(Integer n, Integer curr, ArrayList<Integer> primeNumbers, HashSet<Integer> nonPrimeNumbers) {
        if(curr > n) return primeNumbers;
        if(nonPrimeNumbers.contains(curr)) return calculate(n, curr+1, primeNumbers, nonPrimeNumbers);
        if(isPrime(curr)) {
            primeNumbers.add(curr);
        }
        for(int i = curr; i <=n; i+=curr) {
            nonPrimeNumbers.add(i);
        }
        return calculate(n, curr+1, primeNumbers, nonPrimeNumbers);
    }
    public static boolean isPrime(Integer n) {
        if(n<=1) return false;
        if(n==2) return true;
        return isPrime(n, 2);
    }
    private static boolean isPrime(Integer n, Integer nextToDivide) {
        if(nextToDivide*nextToDivide > n) return true;
        if(n%nextToDivide == 0) return false;
        return isPrime(n, nextToDivide+1);
    }
}
