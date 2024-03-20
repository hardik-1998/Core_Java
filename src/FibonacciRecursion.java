public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(nthfibonacci(4));
    }
    public static int nthfibonacci(int n) {
        if(n < 2) {
            return n;
        }
        return nthfibonacci(n-1) + nthfibonacci(n-2);
    }
}
