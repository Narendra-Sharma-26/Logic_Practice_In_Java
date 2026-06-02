
// 26.	Finding the Sum of the Digits of the Factorial of a Number

import java.util.Scanner;

public class Q26 {

    //int factNumber=1;

    public int factCalc(int num){
        if(num==0) 
            return 1;
        int factNumber = num * factCalc(num - 1);
        return factNumber;
    }

    public int digitSum(int fact){
        int sum = 0;
        while(fact/10!=0){
            sum = sum + (fact%10);
            fact = fact/10;
        }
        return sum+fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;

        while (true) {
            try {
                System.out.print("Enter a Number for its Factorial's Digits sum: ");
                input = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid Input!!!");
                sc.nextLine();
            }
        }

        Q26 obj = new Q26();
        int factorial = obj.factCalc(input);
        System.out.println("Factorial of "+ input + " is: "+factorial);

        int sum = obj.digitSum(factorial);
        System.out.println("Factorial's Digit sum of the Number "+ input + " is: "+ sum);
    }
}
