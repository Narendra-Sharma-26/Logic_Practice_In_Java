
// 36.	Finding the Sum of Squares of Digits

import java.util.Scanner;

public class Q36 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int input = sc.nextInt();

        int squareSum = 0;

        while(input/10 !=0){
            int mod = input%10;
            squareSum = squareSum + mod*mod;
            input /= 10;
            if(input % 10 == input){
                squareSum = squareSum + input*input;
                break;
            }
        }

        System.out.println("Sum of Square of digits is: " + squareSum);
    }
}
