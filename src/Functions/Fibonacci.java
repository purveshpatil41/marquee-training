package Functions;

import java.util.Scanner;

public class Fibonacci {
    static void fibonacci(int n){

        int first = 0;
        int second = 1;
        int next = 0;

        for(int i = 0; i < n; i++){
            System.out.print(first + " ");

            next = first + second;
            first = second;
            second = next;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }
}
