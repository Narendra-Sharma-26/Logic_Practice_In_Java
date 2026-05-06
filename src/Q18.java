
// 18.	Generating Multiplication Tables

import java.util.Scanner;

public class Q18 {

    public void printTable(int num){
        System.out.println("Table of " + num);
        System.out.println();
        for(int i=1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int input;

        while (true) {
            try {
                System.out.print("Enter a Number for Multliplication Table: ");
                input = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid Input!!!");
                sc.nextLine();
            }
        }

        Q18 obj = new Q18();

        obj.printTable(input);
    }
}
