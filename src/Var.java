import java.sql.SQLOutput;

class Student{
    String name = "Om";
    int age;
    static int roll_no = 49;
}
public class Var {


    public static void EvenOdd(){
        int n = 33;
        String result = (n % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }

    public static void MaxThree(){
        int  a = 10, b = 5, c = 11;
//        int maxi = a > b && a > c ? System.out.println(a) : (b> a && b > c ? System.out.println(b) : System.out.println(c));
        int maxx = (a  > b && a> c ? a : (b > c && b > a)?  b :  c);
        int result = a > b?a:b;
        System.out.println(result <c );
    }

//        question for class 1. find eligible for voting or not
        public static void voting(){
        int age = 32;
        String result = age > 18 ? "Eligible" : "Not eligible";
            System.out.println("voting : "+result);
        }



    public static void main(String[] args) {
        Student s1 = new Student();
//        s1.name = "Rahul";

        Student s2 = new Student();
        s2.name = "Suresh";

        System.out.println("Roll no: "+Student.roll_no);
        byte b1 = 127;
        b1++;
        byte b2 = (byte)(b1 + 3);
        System.out.println(b2);
        int _a = 4;
        int $num = 49;
        int number1  = 30;
        System.out.println("number: "+ _a);
        System.out.println("number: "+ $num);
        System.out.println("number: "+ number1);
//         byte a = 10;
//         byte b = 30;
//        byte c = a +b;
//        System.out.println("C is : "+ c);

        int a = 2;
        if(a < 5)
            System.out.println('A');
        if(a < 6)
            System.out.println('B');
        else{
            System.out.println('C');
        }


//        System.out.println(s1.name);
//        System.out.println(s2.name);


        voting();;


        EvenOdd();

//        System.out.print(System.out.print("Java"));
    }
}
