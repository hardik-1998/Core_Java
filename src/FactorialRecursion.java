public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println("factorial using recursion " + factorial(4));
        System.out.println("factorial using recursion " + factorialwhile(5));
    }
    static int factorial(int n) {
        if (n==1) {
            return 1;
        } else {
            return factorial(n-1) * n;
        }
    }
    static int factorialwhile(int n) {
        int i = 1;
        while(n != 1) {
            i*=n;
            n--;
        }
        return i;
    }
}
