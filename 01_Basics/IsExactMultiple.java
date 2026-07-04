
//N, M-oda exact-a divide aagum
import java.util.Scanner;

public class IsExactMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();// 1st number
        int m = sc.nextInt();// 2nd number
        String res = (n % m == 0) ? ("yes") : ("no");// checking n and m same table divide aitu 0 nu vantha yes divide
                                                     // ahagalana "no"
        System.out.println(res);
    }
}
