//Count the frequency of the digit (int n , int dig ) n and dig are parameter
package Functions;
import java.util.*;

public class Digit_frequency {

    static int checkFrequency(int digit, int n) {
        int count =0;
        while (digit > 0){
            int num = digit % 10;
            if(num == n){
                count++;
            }
            digit /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        int digit = 334332;
        int n = 3;
        System.out.println(checkFrequency(digit, n));
    }
}