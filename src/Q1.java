
// Q1 - Write a program to check whether a number is even or odd.

import java.util.Scanner;
/*
public class Q1 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number to check, if its EVEN or ODD");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println(num + " is Even Number");
        }
        else {
            System.out.println(num + " is ODD Number");
        }
    }
}
*/

public class Q1 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("Enter a Number to check, if its EVEN or ODD");
            String str = sc.nextLine();

            try {
                num = Integer.parseInt(str);
                break;
            } catch(NumberFormatException e) {
                System.out.println("Invalid Input!!! Try Again");
            }

        }
        if (num % 2 == 0){
            System.out.println(num + " is Even Number");
        }
        else {
            System.out.println(num + " is ODD Number");
        }

    }
}