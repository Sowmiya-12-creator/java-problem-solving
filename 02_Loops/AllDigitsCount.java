// Count Total Digits
// Oru number-la motham ethana digits irukku nu count panna program
// Example:
// Input : 123456
// Output: 6

import java.util.Scanner;

public class AllDigitsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n != 0) {
            count++;
            n = n / 10;
        }

        System.out.println("Digits Count = " + count);

        sc.close();
    }
}