package patternPrinting;

import java.util.Scanner;

public class P15_SquareDiagonals {

    public static void squareDiagonals(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i == 0 || i == n-1 || j == 0 || j == n-1 || i == j || i+j == n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a odd Number: ");
        int input = sc.nextInt();
        System.out.println();

        squareDiagonals(input);
        
    }
}
