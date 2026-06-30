// 29.	Generating a Pascal’s Triangle

import java.util.Scanner;

public class Q29 {

    public static void pascalTriangle(int n) {

        for (int i = 0; i < n; i++) {

            int num = 1;

            // Spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // Numbers
            for (int j = 0; j <= i; j++) {

                System.out.print(num + " ");

                num = num * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        pascalTriangle(n);
    }
}
