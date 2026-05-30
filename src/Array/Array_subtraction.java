//Given two array , return the array which is result of substraction of indvidual element in an array
package Array;
import java.util.*;


public class Array_subtraction {
    static int[] subtraction(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] result = new int[n1];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = n1 - 1;
        int borrow = 0;

        while (k >= 0) {
            int digit1 = arr1[i] + borrow;
            int digit2 = (j >= 0) ? arr2[j] : 0;

            if (digit1 < digit2) {
                digit1 = 10 + digit1;
                borrow = -1;
            } else {
                borrow = 0;
            }
            int sub = digit1 - digit2;
            result[k] = sub;
            i--;
            j--;
            k--;
        }
        return result;
        }


    public static void main(String[] args) {

        int[] arr1 = {1, 0, 0, 0};
        int[] arr2 = {1};
        int[] ans = subtraction(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }
}




























