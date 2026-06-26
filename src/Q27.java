
// 27.	Finding the Largest Palindrome in a String

import java.util.Scanner;

public class Q27 {n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = sc.nextLine().toLowerCase();
        // String[] inpArr = input.split("");
        // char[] inpArr = input.toCharArray();

        String LongestPD = "";
        int LpdSize = 0;

        if (input == "" || input.length() == 0) {
            LongestPD = "";
        }

        if (input.length() == 1) {
            LongestPD = input;
            LpdSize = 1;
        }

        if (input.length() >= 2) {
            for (int i = 0; i < input.length() - 1; i++) {
                for (int j = input.length() - 1; j > i; j--) {
                    if (input.charAt(i) == input.charAt(j)) {
                        int x = i;
                        int y = j;
                        String front = "";
                        String back = "";
                        while (x <= j) {
                            front += input.charAt(x);
                            x++;
                        }
                        while (y >= i) {
                            back += input.charAt(y);
                            y--;
                        }
                        if (front.equals(back) && front.length() > LongestPD.length()) {
                            LongestPD = front;
                            LpdSize = LongestPD.length();
                        }

                    }
                }
            }
        }

        System.out.println("Largest Palindrom in String is: " + LongestPD);
        System.out.println("Size of plindrome is: " + LpdSize);
    }
}
