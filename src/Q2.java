
// Program for Prime Number Check. (Basic Approach)

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        Boolean flag = true;

        while (flag) {

            System.out.println("Enter a Number for Prime Number Check:");
            String str = sc.nextLine();

            try {
                num = Integer.parseInt(str);
                break;
            } catch (Exception e) {
                System.out.println("Error: " + e);
                System.out.println("Enter a Valid Input!!!");
            }

        }
        boolean prm = true;
        if (num <= 1) {
            System.out.println(num + " is NOT a Prime Number");
        }

        /*
         * // Basic Approach
         * 
         * for (int i = 2; i < num; i++) {
         * if (num % i == 0) {
         * System.out.println(num + " is NOT a Prime Number");
         * prm = false;
         * break;
         * }
         * 
         * }
         */

        // Better Approach

        for (int i = 2; i * i <= num; i++) { // instead of taking sqrt of num we have
            // taken i * i just to make the computation less.
            if (num % i == 0) {
                System.out.println(num + " is NOT a Prime Number");
                prm = false;
                break;
            }
        }
        if (prm == true) {
                System.out.println(num + " is a Prime Number");
            }

    }
}
