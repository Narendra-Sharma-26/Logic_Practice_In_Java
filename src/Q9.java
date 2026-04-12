
// Q9.	Summing Digits of a Number

// import java.math.BigInteger;
import java.util.Scanner;

public class Q9 {

    public long sumOfDigits(int num) {
        long sum = 0;

        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        while (true) {
            System.out.print("Enter a Number for sum of Digits : ");
            String input = sc.nextLine();

            try {
                num = Integer.parseInt(input);
                break;
            } catch (Exception e) {
                System.out.println("INVALID INPUT!!!");
            }
        }

        Q9 obj = new Q9();

        long result = obj.sumOfDigits(num);
        System.out.println("Sum of Digits of " + num + " = " + result);
    }

}
