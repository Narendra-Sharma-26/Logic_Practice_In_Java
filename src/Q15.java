
// 15.	Sorting an Array

import java.util.Scanner;
import java.util.stream.IntStream;

public class Q15 {

    public int[] arraySort(int[] array){

        int[] sortedArray = new int[array.length];

        for(int i =0; i<array.length-1; i++ ){
            for(int j =0; j<array.length-1; j++){
                if(array[i]<array[j])
                    
            }
        }
    }   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array: ");
        int size = sc.nextInt();

        int[] array = IntStream.range(0, size).map(i -> {
            System.out.print("Enter Number "+ (i+1)+ " : ");
            return sc.nextInt();
        }).toArray();

        Q15 obj = new Q15();

        int[] result = obj.arraySort(array);
        System.out.print("Given Array: ");
        IntStream.of(array).forEach(num -> System.out.print(num + " "));
        System.out.println();
        System.out.print("Sorted Array: ");
        IntStream.of(result).forEach(num -> System.out.print(num + " "));


    }
}
