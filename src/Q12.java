
// 12.	Counting Vowels and Consonants in a String

import java.util.Scanner;

public class Q12 {

    public int[] vowelsAndConsonantsCount(String str){

        int vowelCount=0;
        int consonantCount=0;

        for(int i=0; i<str.length(); i++){
            char currentCh = str.charAt(i);

            if(currentCh == 'a' || currentCh == 'e' || currentCh == 'i' || currentCh == 'o' || currentCh == 'u')
                vowelCount++;
            else if(Character.isLetter(currentCh) && !(currentCh == 'a' || currentCh == 'e' || currentCh == 'i' || currentCh == 'o' || currentCh == 'u'))
                consonantCount++;   
        }
        int arr[] = {vowelCount,consonantCount};
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        Q12 obj = new Q12();

        int result[] = obj.vowelsAndConsonantsCount(str.toLowerCase());
        System.out.println("Given String: "+ str);
        System.out.println("Number of Vowels: "+ result[0]);
        System.out.println("Number of Consonants: "+ result[1]);
    }
}
