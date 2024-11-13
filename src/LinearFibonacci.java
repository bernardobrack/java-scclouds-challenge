public class LinearFibonacci {

    public static int calculate(int n) throws IllegalArgumentException {
        if(n<0) throw new IllegalArgumentException("The number is expected to be at least 0");
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
