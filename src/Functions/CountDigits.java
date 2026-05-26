//Count Digits in a Number

package Functions;

public class CountDigits {
    static int countDig(int a) {
        int count = 0;
        while (a > 0) {

            a = a / 10;
            count++;
        }
//        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {

        System.out.println(countDig(23334));
    }
}


