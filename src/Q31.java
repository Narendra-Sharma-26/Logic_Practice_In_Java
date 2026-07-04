
// 31.	Calculating the Power of a Number

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int base = sc.nextInt();
        System.out.print("Enter Exponent: ");
        int exp = sc.nextInt();

        int result = 1;

        for(int i=0; i<exp; i++){
            result = result * base;
        }

        System.out.println(base + " to power " + exp + " = " + result);
    }
}
