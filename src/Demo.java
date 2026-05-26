public class Demo {
    static void age_checker(int age){
        if(age < 18){
            System.out.println("You are below 18");
        }
        else if(age >= 18 && age < 65) {
            System.out.println("You are above 18");
        }
        else if(age >= 65){
            System.out.println("You are senior citizen");
        }
        else{
            System.out.println("Invalid age");
        }
    }
    public static void main(String[] args) {
        System.out.println(5+5+ "Hello");
        System.out.println("Hello" + 5+ 5);
        System.out.print("Hey");
        System.out.println("Hello");
        System.out.println("world");
        System.out.println(5 / 2.0);
        int a = 10;
        int b = 5;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a +"\n"+b);


        age_checker(12);
    }
}
