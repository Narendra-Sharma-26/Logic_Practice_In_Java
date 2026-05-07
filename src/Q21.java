
// 21.	Calculating the Sum of Even Numbers in a Range

import java.util.Scanner;

public class Q21 {

    public int evenSum(int lowLmt, int uppLmt){
        int sum =0;

        for (int i =lowLmt; i<=uppLmt; i++){
            if(i % 2 == 0)
                sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int lowLmt;
        int uppLmt;

        while (true) {
            try {
                System.out.println("Calculate the sum of Even Numbers in Range");
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

        Q21 obj = new Q21();

        int result = obj.evenSum(lowLmt, uppLmt);
        System.out.println("Sum of Even Number between " + lowLmt + " and " + uppLmt + " is: " + result);
    }
}
