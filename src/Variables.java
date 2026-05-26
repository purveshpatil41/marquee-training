import java.util.*;
public class Variables {
    int instanceVar = 10;
    static String staticVar = "Im static";
    public void showVariables(){
        int localVar = 5;
        System.out.println("Instance variable: "+ instanceVar + " static variable: " + staticVar + " Local variable:  " + localVar);
    }
    


    public static void main(String[] args) {
        Variables myobj1 = new Variables();
        myobj1.showVariables();

        System.out.println(20+30+"java");
        System.out.println(20+30+"java"+10+20);
    }
}

