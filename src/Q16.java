
// 16.	Finding the Sum of Elements in an Array

import java.util.Scanner;
import java.util.stream.IntStream;

public class Q16 {

    public int arraySum(int[] array){
        int sum = 0;
        for(int i: array){
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();

        int[] array = IntStream.range(0, size).map(i -> {
            System.out.print("Enter element "+(i+1)+ " : ");
            return sc.nextInt();
        }).toArray();


        Q16 obj = new Q16();
        int result = obj.arraySum(array);
        System.out.println("Sum of the Array is: "+ result);
    }
}
