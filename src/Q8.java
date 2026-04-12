
// Q8. Finding the Factorial of a Number

import java.math.BigInteger;
import java.util.Scanner;

public class Q8 {

    public BigInteger findFactorial(int num){
        BigInteger fact = BigInteger.ONE;

        for(int i=num; i>=1; i--){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;

        while (true) {
            System.out.print("Enter a Number to get its Factorial : ");
            String input = sc.nextLine();

            try {
                num = Integer.parseInt(input);
                break;
            } catch (Exception e) {
                System.out.println("INVALID INPUT!!!");
            }
        }

        Q8 obj = new Q8();

        BigInteger result = obj.findFactorial(num);
        System.out.println("Factorial of "+ num + " = " + result);

    }
}
