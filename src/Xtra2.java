
// Finding the First occurance in the String. (strStr)

import java.util.Scanner;

public class Xtra2 {

    public int findOccurance(String str1, String str2){

        int str1Len = str1.length();
        int str2Len = str2.length();

        int occuranceIndex;

        if(str1Len > str2Len){
            occuranceIndex = str1.indexOf(str2);           
        }
        else {
            occuranceIndex = str2.indexOf(str1);
        }
        return occuranceIndex;


        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();

        Xtra2 obj = new Xtra2();

        int result = obj.findOccurance(str1, str2);
        if(result != -1)
            System.out.println("First occurance is Start at index: "+ result);
        else if(result == -1)
            System.out.println("sub-String NOT Found!!! "+ result);
    }
}
