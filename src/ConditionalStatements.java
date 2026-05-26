import java.math.BigDecimal;

public class ConditionalStatements {
    public static void main(String[] args) {
        if (5 > 3) {
            System.out.println("Yes");
            ;
        } else {
            System.out.println("No");

        }
        System.out.println('A' + 'B');
        System.out.println(5 > 3 || 10 > 20 && 2 < 1);
        System.out.println('A' + "B" + 2 + 3);
        System.out.println("hello" + (20 + 30));
//        System.out.println((1.0));
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        BigDecimal res = b1.add(b2);
        System.out.println(res);
        byte b3 = 127;
        ++b3;
        System.out.println(b3);
        b3++;
        System.out.println(b3);

//        if (x > 5 || x++ > 100) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//
//            System.out.print1n(x);
//
//            if (x > 5 | x++ > 100) {
//                System.out.println("True");
//            } else {
//                System.out.println("False");
//            }
        }
    }

