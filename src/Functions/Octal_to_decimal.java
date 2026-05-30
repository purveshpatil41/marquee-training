package Functions;


public class Octal_to_decimal {
    public static void main(String[] args) {
        int octal = 140;
        int decimal = 0;
        int base = 1;
        while (octal > 0) {
            int digit = octal % 10;
            decimal += digit * base;
            base *= 8;
            octal = octal / 10;
        }
        System.out.println(decimal);
    }
}



