
// 39.	Finding the Count of Specific Digits in a Number

import java.util.Scanner;

public class Q39 {

    public static int countDigit(int num, int dig){
        int count=0;

        while(num%10 != num){
            int unitdigit = num%10;

            if(unitdigit == dig)
                count++;

            num = num/10;

            if(num%10 == num){
                if(num == dig)
                    count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int input1 = sc.nextInt();
        System.out.print("Enter a digit: ");
        int input2 = sc.nextInt();

        int result = countDigit(input1, input2);
        System.out.println("The Count of digit "+input2+" in number "+input1+" is: "+result);
    }
}
