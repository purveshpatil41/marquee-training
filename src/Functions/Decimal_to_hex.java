package Functions;

public class Decimal_to_hex
{
    static void decimalToHex(int n){

        char[] hex = {
                '0', '1', '2', '3', '4', '5',
                '6', '7', '8', '9', 'A', 'B', 'C',
                'D', 'E', 'F'
        };
        String ans = "";
        while(n>0){
            int rem = n % 16;
            ans = hex[rem] + ans;
            n /= 16;
        }
    System.out.println(ans);
}

    public static void main(String[] args) {
        int n = 100;
        decimalToHex(n);
    }
}
