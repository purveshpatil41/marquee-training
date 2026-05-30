//Write a function to check if a number is strong number or not (boolean return type)
package Functions;

public class Strong_number {

    static int factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    static boolean checkStrongNo(int n){
        int org = n;
        int sum = 0;
        while(n >0){
            int digit = n % 10;
            sum += factorial(digit);
            n /= 10;
        }
        return sum == org;
    }

    public static void main(String[] args) {
        int num = 145;
        if(checkStrongNo(num)) {
            System.out.println(num + " is a strong number");
        } else{
            System.out.println(num + " is NOT a strong number");
        }

    }

}
