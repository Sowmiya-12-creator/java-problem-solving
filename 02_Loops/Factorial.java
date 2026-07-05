// Factorial of a Number
// Oru number oda factorial-a calculate panna program
// Formula: n! = 1 × 2 × 3 × ... × n
// Example:
// Input : 5
// Output: 120

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);

        sc.close();
    }
}