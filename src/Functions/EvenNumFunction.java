package Functions;

public class EvenNumFunction {

    int sumOfEven(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
            EvenNumFunction obj = new EvenNumFunction();
            int result = obj.sumOfEven(1, 10);
            System.out.println(result);
        }

    }


