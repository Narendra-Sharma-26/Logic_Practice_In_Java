package patternPrinting;

import java.util.Scanner;

public class P6_InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Heigh of Pyramid: ");
        int input = sc.nextInt();

        for(int i=input; i>0; i--){
            for(int space=0; space<(input-i); space++){
                System.out.print(" ");
            }
            for(int star=0; star < (i*2 - 1); star++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
