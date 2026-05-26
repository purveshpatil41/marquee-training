import java.util.Scanner;

public class Calculator {
//    public static void function_name
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            char ch = sc.next().charAt(0);
            int a = sc.nextInt();
            int b = sc.nextInt();
//            float result = 0;
            switch(ch){
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;

                case '*':
                    System.out.println(a*b);
                    break;

                case '/':
                    if(b != 0) {

                        System.out.println(a / b);
                    }
                    else {
                        System.out.println("Can't be divisible by 0");
                    }
                    break;
                default:
                    System.out.println("Invalid operator");



                }

            }

    }

