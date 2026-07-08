package patternPrinting;

import java.util.Scanner;

public class P14_Swastik {

    public static void swastik(int num) {
        for (int i = 1; i <= num; i++) {
            if (i == 1) {
                for (int j = 1; j <= num; j++) {
                    if (j >= 2 && j <= num / 2)
                        System.out.print("  ");
                    else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }

            if (i > 1 && i < (num / 2) + 1) {
                for (int j = 1; j <= num; j++) {
                    if (j == 1 || j == (num / 2) + 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            if (i == (num / 2) + 1) {
                for (int j = 1; j <= num; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            if (i > (num / 2) + 1 && i < num) {
                for (int j = 1; j <= num; j++) {
                    if (j == (num / 2) + 1 || j == num) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            if (i == num) {
                for (int j = 1; j <= num; j++) {
                    if (j > (num / 2) + 1 && j < num) {
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("* ");
                    }
                }
                System.out.println();

            }

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a ODD Number: ");
        int input = sc.nextInt();
        System.out.println();

        swastik(input);
    }
}
