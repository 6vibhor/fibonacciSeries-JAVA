import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        int number1 = scan.nextInt();
        System.out.println("Enter another number");
        int number2 = scan.nextInt();
        fibonacci(number1, number2);
    }
    public static void fibonacci(int number1, int number2) {
        int number3 = 0;
        for(int i = 1; i <= 10; i++) {
            System.out.print(number1 + " ");
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
        }
    }
}
