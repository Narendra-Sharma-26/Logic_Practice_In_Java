package patternPrinting;

import java.util.Scanner;

public class P13_TriangleAlphabet {

    public static void rTriangle(int n){
        int ch = 65;

        for(int i = 0; i<n; i++){

            for(int j=0; j<n-i; j++){
                System.out.print((char) (ch+j) + " ");
            }
            System.out.println();
            ch++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height of Triangle: ");
        int input = sc.nextInt();

        rTriangle(input);
    }
}
