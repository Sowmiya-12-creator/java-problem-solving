
// Check whether the given number is even or not
import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String result = (n % 2 == 0) ? "Even" : "not even";

        System.out.println(n + " is " + result);

        sc.close();
    }
}