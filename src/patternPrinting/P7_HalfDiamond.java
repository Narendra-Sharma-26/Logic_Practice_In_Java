package patternPrinting;

import java.util.Scanner;

public class P7_HalfDiamond {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer value for Half Diamond: ");
        int input = sc.nextInt();

        for(int i=1; i<=input; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int p=input-1; p>0; p--){
            for(int q=p; q>0; q-- ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
