import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        // Read the number//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        {
            // % means reminder so 10 using to get the last digit//
            int lastdigit = Math.abs(n % 10);// using math.abs to handle negative also //
            System.out.print(lastdigit);
        }

    }

}
