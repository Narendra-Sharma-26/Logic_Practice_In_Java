
// 28.	Finding Missing Numbers in a Sequence

import java.util.Scanner;

public class Q28 {

    public int missingValue(int[] arr, int size){

        int start = 1;
        int end = size;

        for(int i=0, j=size-1; i<size-1 ; i++,j--){
            if(arr[i] != start){
                // return start;
                break;
            }
            start++;
            // if(arr[j] != end){
            //     return end;
            // }
            // end--;
        }
        return start;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sequence length for(1-n): ");
        int size = sc.nextInt();

        int[] seq = new int[size-1];

        for(int i=0; i<size-1; i++){
            seq[i] = sc.nextInt();
        }

        Q28 obj = new Q28();

        int result = obj.missingValue(seq,size);
        System.out.println("Missing Number is: "+result);
    }
}
