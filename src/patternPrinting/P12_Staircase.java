package patternPrinting;

import java.util.Scanner;

public class P12_Staircase {

    public static void stairCase(int n){
        for(int i=1; i<=n; i++){

            int k;
            if(i%2 != 0)
                k = i + 1;
            else
                k =  i;

            for(int j=0; j<k; j++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of stair(even number): ");
        int input = sc.nextInt();

        stairCase(input);
    }
}
