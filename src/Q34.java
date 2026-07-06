
// 34.	Finding the N-th Triangular Number(sum of first N natural numbers)

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Natural Number: ");
        int input = sc.nextInt();

        int sum=0;

        for(int i=1; i<=input; i++){
            sum += i;
        }

        System.out.println("Sum of "+input+"th Triangular Number: " + sum);
    }
}
