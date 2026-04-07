// Q5. Generating Fabonacci Series upto given number.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Q5 {

    public List<Integer> fabonacciGenerator(int upperLimit){

        int previous = 0;
        int next = 1;
        List<Integer> fabSeries = new ArrayList<>();
        fabSeries.add(0);
        fabSeries.add(1);

        if (upperLimit == 0 || upperLimit < 0 )
            System.out.println("Minimum Upper Limit should be Grater or equal to 1");
        else if (upperLimit == 1)
            return fabSeries;
        else {
            while(previous+next <= upperLimit){
                int temp = previous;
                fabSeries.add(previous+next);
                previous = next;
                next = temp+next;
            }
        }


        return fabSeries;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num=0;
        String input = "";

        while(true) {
            System.out.print("Enter a Upper limit for Fabonacci Series: ");
            input = sc.nextLine();

            try{
                num = Integer.parseInt(input);
                break;
            }catch (Exception e){
                System.out.println("INVALID INPUT!!!");
            }
        }

        Q5 obj = new Q5();

        List<Integer> result = obj.fabonacciGenerator(num);
        System.out.println(result);
    }
}