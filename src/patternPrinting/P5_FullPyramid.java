package patternPrinting;

import java.util.Scanner;

public class P5_FullPyramid {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Pyramid Height: ");
        int input = sc.nextInt();

        for(int i=0; i<input; i++){
            for(int space=0; space<input-(i+1); space++){
                System.out.print(" ");
            }
            for(int star=0; star<(2*i+1); star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
