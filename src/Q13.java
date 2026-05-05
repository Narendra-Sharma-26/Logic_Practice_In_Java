
// Q13.	Reversing a String

import java.util.Scanner;

public class Q13 {

    public String reverseAstring(String str){
        String revString = "";

        for(int i=str.length()-1; i>=0; i--){
            revString = revString + str.charAt(i);
        }
        return revString;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String to Reverse: ");
        String input = sc.nextLine();

        Q13 obj = new Q13();

        String result = obj.reverseAstring(input);
        System.out.println("Given String: "+input);
        System.out.println("Reversed String: "+result);
    }
}
