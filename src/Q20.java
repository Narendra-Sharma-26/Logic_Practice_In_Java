
// 20.	Checking for Perfect Numbers
// Explanation: 28 is a perfect number because its divisors (1, 2, 4, 7, 14) sum up to 28.
// A perfect number is defined as a positive integer that is equal to the sum of its positive proper divisors, excluding the number itself.

import java.util.Scanner;

public class Q20 {

    public Boolean perfectNoCheck(int num){

        if(num == 0 || num == 1)
            return false;

        int sum =0;

        for(int i =1; i<=num/2; i++){
            if(num % i == 0)
                sum += i;
        }

        if(num == sum)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;

        while (true) {
            try {
                System.out.print("Enter a Number to check for Perfection: ");
                input = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid Input!!!");
                sc.nextLine();
            }
        }

        Q20 obj = new Q20();

        Boolean result = obj.perfectNoCheck(input);
        if(result)
            System.out.println(input + " is a Perfect Number.");
        else
            System.out.println(input + " is Not a perfect Number.");
    }
}
