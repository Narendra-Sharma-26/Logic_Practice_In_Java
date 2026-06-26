package patternPrinting;

import java.util.Scanner;

public class P8_DiamondShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer for Diamond Shape: ");
        int input = sc.nextInt();

        for(int i=0; i<input; i++){
            for(int space=0; space<input-(i+1); space++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=input; i>0; i--){
            for(int space=input; space-i>0; space--){
                System.out.print(" ");
            }
            for(int star=i; star>0; star--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
