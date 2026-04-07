// Q3. Program to Check Leap Year or Not.

import java.util.Scanner;

public class Q3 {

    public String checkLeap(long year){
        if(year == 0)
            return "INVALID YEAR";
        if(year % 4 == 0 || year % 400 == 0)
            return year + " is a Leap Year";

        return year + " is NOT a Leap Year";
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

        int yr=0;
        String input = "";

        while(true) {
            System.out.print("Enter a Year to check if its Leap or Not: ");
            input = sc.nextLine();

            try{
                yr = Integer.parseInt(input);
                break;
            }catch (Exception e){
                System.out.println("INVALID INPUT!!!");
            }
        }

        Q3 obj = new Q3();

        String result = obj.checkLeap(Integer.parseInt(input));
        System.out.println(result);

    }
}
