
// 40.	Generating a Fibonacci Sequence Using Recursion

import java.util.Scanner;

public class Q40 {

    public static int fibonacci(int n) {

        // Base Cases
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        // Recursive Case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
