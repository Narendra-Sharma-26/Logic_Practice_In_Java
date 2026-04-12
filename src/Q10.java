
// 10.	Finding the Greatest Common Divisor (GCD) / HCF

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10 {

    public int findGCD(int first, int second) {

        int big;
        int small;

        if (first > second) {
            big = first;
            small = second;
        } else {
            big = second;
            small = first;
        }

        List<Integer> arrSmall = new ArrayList<>();
        List<Integer> arrBig = new ArrayList<>();

        for (int i = 1; i <= small; i++) {
            if (small % i == 0)
                arrSmall.add(i);
        }

        for (int j = 1; j <= big; j++) {
            if (big % j == 0)
                arrBig.add(j);
        }

        int gcd = 1;

        for (int k = arrSmall.size() - 1; k >= 0; k--) {
            if (arrBig.contains(arrSmall.get(k))) {
                gcd = arrSmall.get(k);
                return gcd;
            }
        }

        return gcd;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            try {
                System.out.print("Enter First Integer: ");
                first = sc.nextInt();
                System.out.print("Enter Second Integer: ");
                second = sc.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("INVALID INPUT!!!");
                sc.nextLine(); // clear invalid input
            }
        }

        Q10 obj = new Q10();

        int result = obj.findGCD(first, second);
        System.out.println("GCD/HCF of " + first + " and " + second + " is: " + result);

    }
}
