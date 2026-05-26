import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature in celsius: ");
        int num = sc.nextInt();
        int temp = (num * 9/5) + 32;
        System.out.println(temp+ " degree");
    }
}
