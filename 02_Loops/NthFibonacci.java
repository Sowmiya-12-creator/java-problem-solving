// Nth Fibonacci Number
// Fibonacci series-la Nth value find panna program
// Series: 0, 1, 1, 2, 3, 5, 8...
// Example:
// Input : 5
// Output: 5

import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        if (n == 0) {
            System.out.println(a);
        } else if (n == 1) {
            System.out.println(b);
        } else {
            for (int i = 2; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.println(b);
        }

        sc.close();
    }
}