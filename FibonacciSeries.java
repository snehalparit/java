public class FibonacciSeries {
    public static void main(String[] args) {
        int terms = 10; // You can change the value of terms for a different number of Fibonacci terms

        System.out.println("Fibonacci Series up to " + terms + " terms:");
        int a = 0, b = 1;

        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
