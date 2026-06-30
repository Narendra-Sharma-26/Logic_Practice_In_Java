package patternPrinting;

import java.util.Scanner;

public class P11_HollowRectangle {

    public static void hollowSquare(int bre, int len){
        for(int i=0; i<bre; i++){
            for(int j=0; j<len; j++){
                if(i == 0 || i == bre-1 || j == 0 || j == len-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bredth: ");
        int bre = sc.nextInt();
        System.out.print("Enter Length: ");
        int len = sc.nextInt();

        hollowSquare(bre, len);
    }
}
