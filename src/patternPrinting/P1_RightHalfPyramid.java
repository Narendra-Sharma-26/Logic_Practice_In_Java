package patternPrinting;

import java.util.Scanner;

public class P1_RightHalfPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Height of Right Half Pyramid: ");
        int n = sc.nextInt();

        System.out.println();


        char star='*';

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
