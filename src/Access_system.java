import java.util.Scanner;

public class Access_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String role = sc.nextLine().toLowerCase();
        switch(role){
            case "admin":
                System.out.println("Full access");
                break;
            case "student":
                System.out.println("Student Access allowed");
                break;
            case "teachers":
                System.out.println("Teachers accesss only");
                break;
            case "guest":
                System.out.println("Guest accesss only");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
