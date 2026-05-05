
// 14.	Finding the Largest and Smallest Numbers in an Array

import java.util.Scanner;
import java.util.stream.IntStream;

public class Q14 {

    public int[] getMinMax(int[] array){

        int min= array[0];
        int max = array[0];

        for(int i=0; i<array.length; i++){
            if(min > array[i])
                min = array[i];
        }

        for(int i=0; i<array.length; i++){
            if(max < array[i])
                max = array[i];
        }

        int[] newArray = {min, max};
        return newArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int size = sc.nextInt();

        //Taking input elements using stream
        int array[] = IntStream.range(0, size).map(i -> {
            System.out.print("Enter element "+ (i+1) + " : ");
            return sc.nextInt();
        }).toArray();

        // Input Array:
        System.out.println("Given Array:");
        IntStream.of(array).forEach(num -> System.out.print(num + " "));
        System.out.println();

        Q14 obj = new Q14();

        int result[] = obj.getMinMax(array);
        System.out.println("Min Value: "+ result[0]);
        System.out.println("Max Value: " + result[1]);
    }
}
