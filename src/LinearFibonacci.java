public class LinearFibonacci {
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
        if(n == 0) return 0;
        if(n == 1) return 1;
        int previous = 0;
        int current = 1;
        for(int i = 2; i <= n; i++) {
            int temp = current;
            current = current + previous;
            previous = temp;
        }
        return current;
    }
}
