import java.util.Scanner;

public class SecondLastDigit {
    public static void main(String[] args) {
        // Read the number//
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        // 1st dividing the number store in one variable "secondlastnumber"thenstore in
        // "secondlastdigit" so reminder is the soln//
        int secondLastNumber = (n / 10);
        int secondLastDigit = (secondLastNumber % 10);
        System.out.print(secondLastDigit);
    }
}
