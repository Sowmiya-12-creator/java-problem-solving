// Number of Primes in a Specified Range
// Kudutha range-kulla ethana prime numbers irukku nu count panna program
// Example:
// Input : 10 20
// Output: 4

import java.util.Scanner;

public class CountPrimesInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Starting Number: ");
        int start = sc.nextInt();

        System.out.print("Enter Ending Number: ");
        int end = sc.nextInt();

        int count = 0;

        for (int i = start; i <= end; i++) {
            int factors = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    factors++;
                }
            }

            if (factors == 2) {
                count++;
            }
        }

        System.out.println("Prime Count = " + count);

        sc.close();
    }
}