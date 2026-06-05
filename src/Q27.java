
// 27.	Finding the Largest Palindrome in a String

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = sc.nextLine().toLowerCase();
        // String[] inpArr = input.split("");
        char[] inpArr = input.toCharArray();

        String Lpd = "";
        int LpdSize = 0;

        if (inpArr.length == 1) {
            Lpd += inpArr[0];
            LpdSize = 1;
        }
        // if (inpArr.length == 2) {
        //     Lpd += input;
        //     LpdSize = 2;
        // }

        for (int i = 0, j = inpArr.length - 1; i <= inpArr.length - 2; i++) {

            if ((inpArr[i] == inpArr[j]) && (inpArr.length > 1)) {
                String temp1 = "";
                String temp2 = "";

                for (int x = i, y = j; x < inpArr.length - i; x++, y--) {
                    temp1 += inpArr[x];
                    temp2 += inpArr[y];
                }
                if ((temp1.equals(temp2)) && (LpdSize < temp1.length())) {
                    Lpd = temp1;
                    LpdSize = temp1.length();
                }
            }
        }

        System.out.println("Largest Palindrom in String is: " + Lpd);
        System.out.println("Size of plindrome is: " + LpdSize);
    }
}
