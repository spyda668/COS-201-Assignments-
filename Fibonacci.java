
public class Fibonacci {
    public static void main(String[] args) {

        int n1 = 0, n2 = 1, next;

        System.out.println("First 100 Fibonacci numbers:");

        for (int i = 1; i <= 100; i++) {

            System.out.print(n1 + " ");

            next = n1 + n2;
            n1 = n2;
            n2 = next;
        }
    }
}
