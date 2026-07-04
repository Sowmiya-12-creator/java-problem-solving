
// Kodukkappatta 5 numbers-la ethana numbers even-nu kandupidikka vendum.//
import java.util.Scanner;

public class CountEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");// Enter the 5 number
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int evenCount = 0;// intialize the evencount =0
        if (n % 2 == 0)// check the even
            evenCount++;// if even increment
        if (a % 2 == 0)
            evenCount++;

        if (b % 2 == 0)
            evenCount++;

        if (c % 2 == 0)
            evenCount++;

        if (d % 2 == 0)
            evenCount++;

        System.out.println("EvenCount is:" + evenCount);// final print

    }
}
