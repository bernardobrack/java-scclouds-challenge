import java.util.ArrayList;

public class RecursivePrimeNumbers {
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
        System.out.println(primeNumbersArray);

    }

    public static ArrayList<Integer> getAllPrimeNumbersUpTo(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        recursiveGetAllPrimeNumbersUpTo(n, 2, answer);
        return answer;
    }

    public static void recursiveGetAllPrimeNumbersUpTo(int n, int curr, ArrayList<Integer> array) {
        if(isPrime(curr)) {
            array.add(curr);
        }
        if(curr < n) recursiveGetAllPrimeNumbersUpTo(n, ++curr, array);
    }
    public static boolean isPrime(int n) {
        for(int i = 2; i < n; i++) {
            if(n % i ==0) return false;
        }
        return true;
    }
}
