import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("prime Number");
        } else {
            System.out.print("not a prime number");
        }
    }
}
