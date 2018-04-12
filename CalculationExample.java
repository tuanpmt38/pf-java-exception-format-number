import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number x: ");
        int x = scanner.nextInt();
        System.out.println(" Enter number y: ");
        int y = scanner.nextInt();
        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);
    }

    public void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Display Sum:" + a);
            System.out.println("Display Minus:" + b);
            System.out.println("Display Multip:" + c);
            System.out.println("Display division:" + d);
        } catch (Exception e) {
            System.out.println("Exception:" + e.getMessage());
        }
    }
}
