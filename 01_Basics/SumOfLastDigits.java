import java.util.Scanner;

public class SumOfLastDigits {
    public static void main(String[] args) {// Read the number//
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = sc.nextInt();// 1st number//
        int b = sc.nextInt();// 2nd number//
        int FirstLastDigit = (a % 10);// now taking last digit//
        int SecondLastDigit = (b % 10);// now taking last digit//
        int Sum = (FirstLastDigit + SecondLastDigit);// adding 2 number//
        System.out.println(Sum);// printing sum//
    }
}
