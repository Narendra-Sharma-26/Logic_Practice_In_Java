
// Q11. Finding LCM of two numbers

import java.util.Scanner;

public class Q11 {

    public int findLcm(int a, int b){

        int big = Math.max(a, b);
        int small = Math.min(a, b);

        for(int i = big; i<=a*b; i+=big){
            if(i%small==0)
                return i;
        }
        return a*b;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first;
        int second;

        while (true) {
            try {
                System.out.print("Enter First Integer: ");
                first = sc.nextInt();
                System.out.print("Enter Second Integer: ");
                second = sc.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("INVALID INPUT!!!");
                sc.nextLine(); // clear invalid input
            }
        }

        Q11 obj = new Q11();

        int result = obj.findLcm(first, second);
        System.out.println("LCM of "+ first + " & "+ second + " is: "+ result);
    }
}
