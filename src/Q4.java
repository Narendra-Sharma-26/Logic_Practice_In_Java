// Q4. Program to Check if its Armstrong Number.

import java.util.Scanner;

public class Q4 {

    public String checkArmstrong(String strNo, int num, int power){
        double result = 0;

        for(int i=0 ; i < power; i++){
            char s = strNo.charAt(i);
            int numeric = s - '0';
            //System.out.println(numeric);
            
            //int numericValue = Character.getNumericValue(s);
            result = result + (Math.pow(numeric,power));
        }
        if (result == num){
            return num + " is a ArmStrong Number";
        }
        return num + " is NOT a ArmStrong Number";
    }

    public static void main (String []args){

        Scanner sc = new Scanner(System.in);

        int no=0;
        String input = "";
        int lenOfnum = 0;

        while(true) {
            System.out.print("Enter a Number to check if its ArmStrong or Not: ");
            input = sc.nextLine();

            try{
                no = Integer.parseInt(input);
                lenOfnum = input.length();
                break;
            }catch (Exception e){
                System.out.println("INVALID INPUT!!!");
            }
        }

        Q4 obj = new Q4();

        String result = obj.checkArmstrong(input, no, lenOfnum);
        System.out.println(result);

    }
}
