
// 33.	Finding the Sum of Prime Numbers in a Range

import java.util.ArrayList;
import java.util.Scanner;

public class Q33 {

    static ArrayList <Integer> plist = new ArrayList<>();

    public static int primeSum(int lo, int up){
        int primesum = 0;

        for(int i=lo; i<=up; i++){
            if(isPrime(i)){
                plist.add(i);
                primesum += i;
            }
        }
        return primesum;
    }

    public static boolean isPrime(int num){
        if(num == 1) return false;
        if(num == 2 || num == 3) return true;

        int limit = (int) Math.sqrt(num);
        for(int i=2; i<=limit; i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Lower limit: ");
        int low = sc.nextInt();
        System.out.print("Enter upper limit: ");
        int upp = sc.nextInt();

        int sum = primeSum(low, upp);
        System.out.println("Prime numbers in range: " + plist);
        System.out.println("Sum of Prime Number in Range: " + sum);
    }
}
