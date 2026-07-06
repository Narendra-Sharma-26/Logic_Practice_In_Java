
// 35.	Checking for Perfect Squares

import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number:");
        double input = sc.nextInt();

        double num = Math.sqrt(input);

        if(num*num == input){
            System.out.println("Yes it a perfect Square.");
        }
        else{
            System.out.println("Not a perfect square.");
        }


    }
}
