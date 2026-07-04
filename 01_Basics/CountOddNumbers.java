
// Kodukkappatta 5 numbers-la ethana numbers odd-nu kandupidikka vendum.
import java.util.Scanner;

public class CountOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");// Enter the 5 number
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int oddCount = 0;// intialize odd count =0
        if (n % 2 != 0)// check condition for the odd
            oddCount++;// if odd increment
        if (a % 2 != 0)
            oddCount++;

        if (b % 2 != 0)
            oddCount++;

        if (c % 2 != 0)
            oddCount++;

        if (d % 2 != 0)
            oddCount++;

        System.out.println("OddCount is:" + oddCount);// final print

    }
}
