
// 15.	Sorting an Array

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Q15 {

    public int[] arraySort(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);

        for (int i = 0; i < sortedArray.length - 1; i++) {

            for (int j = i + 1; j <= sortedArray.length - 1; j++) {

                int temp = sortedArray[i];

                if (sortedArray[i] > sortedArray[j]) {
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array;
        int size = 0;

        while (true) {

            try {
                System.out.print("Enter the size of Array: ");
                size = sc.nextInt();
                break;
                // array = IntStream.range(0, size).map(i -> {
                // System.out.print("Enter Number " + (i + 1) + " : ");
                // return sc.nextInt();
                // }).toArray();
                // break;

            } catch (Exception e) {
                System.out.println("Invalid Input!!!");
                sc.nextLine();
            }

        }

        while(true) {
            try {
                    array = IntStream.range(0, size).map(i -> {
                        System.out.print("Enter Number " + (i + 1) + " : ");
                        return sc.nextInt();
                    }).toArray();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input!!! Again!!!");
                    sc.nextLine();
                }
        }

        Q15 obj = new Q15();

        int[] result = obj.arraySort(array);
        System.out.print("Given Array: ");
        IntStream.of(array).forEach(num -> System.out.print(num + " "));
        System.out.println();
        System.out.print("Sorted Array: ");
        IntStream.of(result).forEach(num -> System.out.print(num + " "));

    }
}
