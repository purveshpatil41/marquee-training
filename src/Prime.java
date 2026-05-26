import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int n = 30;
        boolean isPrime = true;
        int i = 2;
        while(i <= n/ 2){
            if(n % 1 == 0){
                isPrime = false;
                break;
            }

        }
        if(isPrime)
            System.out.println("Prime number");
    }
}




