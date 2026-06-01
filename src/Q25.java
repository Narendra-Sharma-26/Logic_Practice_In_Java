
// 25.	Generating a Pattern of Numbers

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No of Rows: ");
        int input = sc.nextInt();

        int digit=1;

        for(int i=0; i<input; i++){
            for(int j=0; j<=i; j++){
                System.out.print(digit++ + " ");  // Advance way for printing and post increment
            }
            System.out.println();
        }
    }
}
