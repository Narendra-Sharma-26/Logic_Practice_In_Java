
// 37.	Generating a Square Matrix of a Given Size

import java.util.Scanner;

public class Q37 {

    public static void matrixCnP(int n){
        // Matrix Creation

        int matrix[][] = new int[n][n];

        int num=1;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = num;
                num++;
            }
        }

        // Matrix Printing

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a digit(dimension) for square Matrix: ");
        int input = sc.nextInt();

        matrixCnP(input);
    }
}