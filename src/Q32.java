
// 32.	Checking for an Anagram

import java.util.Scanner;

public class Q32 {

    public static boolean isAnagram(String s1, String s2){
        String str1 = (s1.replaceAll("\\s", "")).toLowerCase();
        String str2 = (s2.replaceAll("\\s", "")).toLowerCase();

        if(str1.length() != str2.length())
            return false;

        int[] count = new int[26];

        for(int i=0; i<str1.length(); i++){
            count[str1.charAt(i)-'a']++;
            count[str2.charAt(i)-'a']--;
        }

        for(int x: count){
            if(x != 0){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String str1 = sc.nextLine();
        System.out.print("Enter String 2: ");
        String str2 = sc.nextLine();

        boolean result = isAnagram(str1, str2);
        if(result){
            System.out.println("Yes its a Anagram");
        }
        else{
            System.out.println("No its Not a Anagram");
        }
    }
}
