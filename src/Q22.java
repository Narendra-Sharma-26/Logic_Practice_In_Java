
// 22.	Finding the Fibonacci Number at a Specific Position/index

import java.util.Scanner;

public class Q22 {

    public int fabonacciNumber(int index){

        if(index == 0)
            return 0;
        if(index == 1)
            return 1;

        int fabNo=0;

        int first = 0;
        int second = 1;

        for(int i=1; i<index; i++){

            int temp = second;
            second = first + second;
            first = temp;

        }
        return second;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input;

        while (true) {
            try {
                System.out.print("Enter position/index to get Fabonacci Number: ");
                input = sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("INVALID INPUT!!!");
                sc.nextLine();
            }
        }

        Q22 obj = new Q22();

        int result = obj.fabonacciNumber(input);
        System.out.println("Fabanacci Number at position/Index " + input + " is: " +result);
    }
}
