package patternPrinting;

import java.util.Scanner;

public class P3_InvertedLeftHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter Height of Pyramid: ");
        int input = sc.nextInt();

        for(int i = input; i>0; i--){
            for(int j=0; j<input-i; j++){
                System.out.print(" ");
            }
            for(int k =i; k>0; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
