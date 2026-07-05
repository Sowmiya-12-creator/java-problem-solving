// Nth Prime Number
// Nth prime number find panna program
// Prime number-na 1 and adhe number mattum divide aagum
// Example:
// Input : 5
// Output: 11

import java.util.Scanner;

public class NthPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 1;

        while (count < n) {
            num++;

            int factors = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    factors++;
                }
            }

            if (factors == 2) {
                count++;
            }
        }

        System.out.println(num);

        sc.close();
    }
}