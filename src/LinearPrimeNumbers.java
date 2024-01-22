import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class LinearPrimeNumbers {
    public static void main(String[] args) {
        if(args.length == 0) return;
        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch(NumberFormatException e) {
            System.out.println("Please provide a number as the first argument");
            return;
        }
        if(n<=1) {
            System.out.println("Please provide an integer greater than 1 as the first argument");
            return;
        }

        ArrayList<Integer> primeNumbersArray = getAllPrimeNumbersUpTo(n);
        System.out.println(primeNumbersArray.toString());

    }

    public static ArrayList<Integer> getAllPrimeNumbersUpTo(int to) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 2; i <= to; i++) {
            if(isPrime(i)) answer.add(i);
        }
        return answer;
    }
    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i ==0) return false;
        }
        return true;
    }
}
