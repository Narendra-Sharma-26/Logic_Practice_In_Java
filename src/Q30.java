
// 30.	Finding the Median of an Array 

import java.util.Arrays;
import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Array: ");
        String input = sc.nextLine();

        String[] arr = input.split(" ");

        // converting an string array to int array using stream api
        int[] array = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

        System.out.println("Input Array: " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Sorted Array: " + Arrays.toString(array));

        float median;

        if (array.length % 2 == 0) {
            median = (array[array.length / 2] + array[array.length / 2 - 1])/2;
        }
        else{
            median = array[array.length / 2];
        }

        System.out.println("Median: "+ median);
    }
}
