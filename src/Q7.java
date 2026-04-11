
// Q7.	Crafting Star Patterns

import java.util.Scanner;

public class Q7 {

    public void createTriangle(int height){

        String space=" ", star = "*";

        for (int row =1; row <= height; row++){
            for(int i = 1; i<=height-row; i++){
                System.out.print(space);
            }
            for(int j=1; j <= ((2*row)-1); j++){
                System.out.print(star);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int height = 0;

        while (true) {
            System.out.print("Enter Height of Triangle (Interger): ");
            String input = sc.nextLine();

            try {
                height = Integer.parseInt(input);
                break;
            } catch (Exception e) {
                System.out.println("INVALID INPUT!!!");
            }
        }

        Q7 obj = new Q7();

        obj.createTriangle(height);

    }
}
