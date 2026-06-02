package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rotate_Array {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rotate(arr, 2);
        System.out.println(Arrays.toString(arr));

    }
    public static void rotate(int[] arr, int r){
        int n = arr.length;
        r %= n;
        swap(arr, 0,r-1);
        swap(arr, r,n-1);
        swap(arr, 0,n-1);

    }
    public static void swap(int[] arr, int i , int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
