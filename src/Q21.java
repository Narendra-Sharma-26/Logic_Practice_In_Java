
// 21.	Calculating the Sum of Even Numbers in a Range

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

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
                if(lowLmt < 0)
                    throw new NegativeNumberException("Negative Number not Allowed!!!");
                System.out.print("Enter Range (Upper limit): ");
                uppLmt = sc.nextInt();
                if(uppLmt < 0)
                    throw new NegativeNumberException("Negative Number not Allowed!!!");
                break;
            } catch (NegativeNumberException e){
                System.out.println(e.getMessage());
                sc.nextLine();
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
