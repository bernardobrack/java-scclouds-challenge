import java.util.HashMap;

public class RecursiveFibonacci {

    public static int calculate(Integer n) throws IllegalArgumentException {
        if(n<0) throw new IllegalArgumentException("The number is expected to be at least 0");
        if(n==0) return 0;
        if(n<=2) return 1;
        HashMap<Integer, Integer> memo = new HashMap<>();
        return RecursiveFibonacci.calculate(n-1, memo)+RecursiveFibonacci.calculate(n-2, memo);


    }
    private static int calculate(Integer n, HashMap<Integer, Integer> memo) {
        if(memo.containsKey(n)) return memo.get(n);
        if(n<=2) return 1;
        memo.put(n, calculate(n-1, memo) + calculate(n-2, memo));
        return memo.get(n);
    }

}
