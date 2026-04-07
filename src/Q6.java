
// Q6. Program for Identifying Palindromes.

import java.util.Scanner;

public class Q6 {

    public String palindromeCheck(String str){

        String fstring="";
        String Bstring="";

        for(int i=0, j=str.length()-1; i<str.length(); i++, j--){
            fstring += str.charAt(i);
            Bstring += str.charAt(j);
        }

        if(fstring.equals(Bstring))
            return str + " is a Palindrome";
        else
            return str + " is NOT a Palindrome";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String or numbers to Check for palindrome(Case Sensitive): ");
        String input = sc.nextLine();

        Q6 obj = new Q6();

        String result = obj.palindromeCheck(input);
        System.out.println(result);
    }
}
