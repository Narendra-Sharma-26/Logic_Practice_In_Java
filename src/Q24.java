
// 24.	Finding the Number of Digits in a Number

import java.util.Scanner;

public class Q24 {

    public int digitCount(int number){
        int count=0;

        int copyOfNum = number;

        while (copyOfNum>0) {
            count++;
            copyOfNum /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;

        while (true) {
            try {
                System.out.print("Enter any Integer: ");
                input = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("INVALID INPUT!!!");
                sc.nextLine();
            }
        }

        Q24 obj = new Q24();

        int result = obj.digitCount(input);
        System.out.println("The given Integer " + input + " has " + result + " digits.");
        
    }
}
