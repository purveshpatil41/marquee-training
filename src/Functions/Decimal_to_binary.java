package Functions;

public class Decimal_to_binary {
    public static void main(String[] args) {
        int num = 100;
        String binary = "";
        while(num>0){
            int remain = num % 2;
            binary = remain + binary;
            num /= 2;
        }
        System.out.println(binary);
    }
}
