import java.util.Scanner;

public class IsOdd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number: ");
        int n = sc.nextInt();

        String res = (n % 2 != 0) ? "Odd" : "Not odd";

        System.out.println(n + " is " + res);

        sc.close();
    }
}