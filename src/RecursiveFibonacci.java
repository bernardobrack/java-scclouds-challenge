public class RecursiveFibonacci {
    public static void main(String[] args) {
        if(args.length == 0) return;
        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch(NumberFormatException e) {
            System.out.println("Please provide a number as the first argument");
            return;
        }
        if(n<0) return;
        System.out.printf("fib(%d): %d", n, fib(n));

    }

    public static int fib(int n) {
        if(n<=1) return n;
        return(recursiveFib(n-2, 0, 1));

    }

    public static int recursiveFib(int n, int prev, int curr) {
        if(n==0) return prev+curr;
        return recursiveFib(n-1, curr, prev+curr);
    }
}
