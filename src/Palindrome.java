public class Palindrome {
    public static void main(String[] args) {
        int n = 111;
                int rev = 0;
        int temp = n;
        while(n > 0){
            int digit= n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        if(temp == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
        System.out.println(rev);
    }
}
