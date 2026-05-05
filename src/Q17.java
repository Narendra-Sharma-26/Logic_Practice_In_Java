
// 17.	Checking for Armstrong Numbers in a Range

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q17 {

    public List<Integer> createRange(int lowLmt, int uppLmt) {

        List<Integer> finalArmstrongList = new ArrayList<>();

        for (int i = lowLmt; i <= uppLmt; i++) {
            Boolean amrNo = returnArmstrong(i);
            if (amrNo)
                finalArmstrongList.add(i);
        }
        return finalArmstrongList;
    }

    public Boolean returnArmstrong(int num) {

        int originalNum = num;

        int numLength = String.valueOf(num).length();
        int power = numLength;

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, power);
            num = num / 10;
        }

        return originalNum == sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lowLmt;
        int uppLmt;

        while (true) {
            try {
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

        Q17 obj = new Q17();

        List<Integer> result = obj.createRange(lowLmt, uppLmt);
        System.out.println("ArmStrong Numbers in Range " + lowLmt + " to " + uppLmt + " are: " + result);
    }
}
