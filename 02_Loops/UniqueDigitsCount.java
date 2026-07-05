// Unique Digits Count
// Repeat aagama irukkura digits count panna program
// Example:
// Input : 112345
// Output: 5

import java.util.Scanner;

public class UniqueDigitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int[] freq = new int[10];

        while (n != 0) {
            int digit = n % 10;
            freq[digit]++;
            n = n / 10;
        }

        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                count++;
            }
        }

        System.out.println("Unique Digits = " + count);

        sc.close();
    }
}