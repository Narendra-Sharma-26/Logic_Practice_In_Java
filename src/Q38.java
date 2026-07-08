
// 38.	Calculating the Sum of Digits of a Number Until Single Digit

import java.util.Scanner;

public class Q38 {

    public static int singleDigitSum(int num) {

        if (num % 10 == num) {
            return num;
        } else {
            int ret = digitsKaSum(num);
            while (ret % 10 != ret) {
                ret = digitsKaSum(ret);
            }
            return ret;
        }

    }

    public static int digitsKaSum(int n) {

        int sum = 0;

        while (n % 10 != n) {
            sum += n % 10;
            n /= 10;
            if (n % 10 == n) {
                sum += n;
            }

        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();

        int result = singleDigitSum(input);
        System.out.println("Single Digit sum of the number " + input + " is: " + result);
    }
}
