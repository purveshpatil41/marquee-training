package Array;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int[] arr ;     //declaration
//        int[] brr = {1, 2, 3, 4};   //initialization

//        int n  = brr.length;
//        for(int i = 0; i < n; i++){
//            System.out.print(brr[i]+" ");

        Scanner sc = new Scanner(System.in);
        int[] arr_name = new int[5];
        for(int i = 0; i <arr_name.length; i++){
            arr_name[i] = sc.nextInt();

        }

        for(int i = 0; i < arr_name.length; i++){
            if(arr_name[i] % 2 == 0){

                System.out.print(arr_name[i]+" ");
            }
        }
    }
}
