
// Kodukkappatta 5 numbers-la ethana numbers even, ethana numbers odd-nu kandupidikka vendum.
import java.util.Scanner;

public class CountEvenOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");// enter the 5 number
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int evencount = 0;// intialize the evencount=0
        int oddcount = 0;// intialise the oddcount=0
        if (n % 2 == 0) {// check the condition
            evencount++;// increment if it is even number
        } else {
            oddcount++;// otherwise odd means add 1 number
        }

        if (a % 2 == 0) {
            evencount++;
        } else {
            oddcount++;
        }
        if (b % 2 == 0) {
            evencount++;
        } else {
            oddcount++;
        }
        if (c % 2 == 0) {
            evencount++;
        } else {
            oddcount++;
        }
        if (d % 2 == 0) {
            evencount++;
        } else {
            oddcount++;
        }
        System.out.println("total even number is :" + evencount);// print how many even number
        System.out.println("total odd number is :" + oddcount);// print how many odd number
    }
}
