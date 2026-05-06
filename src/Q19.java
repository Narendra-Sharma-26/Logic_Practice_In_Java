
// 19.	Finding Prime Numbers in a Range

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q19 {

    public List<Integer> primeList(int lowLmt, int uppLmt) {

        List<Integer> primeNos = new ArrayList<>();

        for (int i = lowLmt; i <= uppLmt; i++) {

            Boolean res = returnIfPrime(i);
            if (res) {
                primeNos.add(i);
            }
        }

        return primeNos;

    }

    public Boolean returnIfPrime(int num) {

        if (num == 1)
            return false;
        if (num == 2)
            return true;
        if (num == 3)
            return true;
        if (num == 4)
            return false;

        int inpsqrt = (int) Math.sqrt(num);

        if (num >= 5) {
            for (int i = 2; i <= inpsqrt; i++) {
                if (num % i == 0)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lowLmt;
        int uppLmt;

        while (true) {
            try {
                System.out.println("Finding Prime Numbers in a Range");
                System.out.print("Enter Range (Lower limit): ");
                lowLmt = sc.nextInt();
                System.out.print("Enter Range (Upper limit): ");
                uppLmt = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid Input!!!");
                sc.nextLine(); // to clear invalid input
            }
        }

        Q19 obj = new Q19();

        List<Integer> result = obj.primeList(lowLmt, uppLmt);
        System.out.println("Prime Number Beteween " + lowLmt + " and " + uppLmt + " are: " + result);
    }
}
