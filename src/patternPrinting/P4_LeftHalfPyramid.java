package patternPrinting;

import java.util.Scanner;

public class P4_LeftHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Height of Pyrmid: ");
        int input = sc.nextInt();

        for(int i=1; i<=input; i++){
            for(int j=1; j<=input-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
