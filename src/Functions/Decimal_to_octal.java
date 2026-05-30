package Functions;

public class Decimal_to_octal {
    static void decimalToOctal(int n){
        String octal = "";
        while(n > 0){
            int remain = n % 8;
             octal = remain + octal;
             n /= 8;
        }
        System.out.println(octal);
    }

    public static void main(String[] args) {
        int n = 123;
        decimalToOctal(n);
    }
}
