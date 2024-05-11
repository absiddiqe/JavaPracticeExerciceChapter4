package operationsWithTwoIinteger;
import java.util.Scanner;
public class Operations {
    public static void main(String[] args) {
        Scanner intput = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = intput.nextInt();
        System.out.println("Enter second number :");
        int num2 = intput.nextInt();
        intput.close();
        int sum = num2 + num1;
        System.out.println("Sum ; " + sum);
        int difference = num1 - num2;
        System.out.println("Difference : " + difference);
        int product = num1 * num2;
        System.out.println("Product : " + product);
        int distence = Math.abs(num2 - num1);
        System.out.println("Distence : " + distence);
        System.out.println("Maximam : " + Math.max(num2, num1));
        System.out.println("Minimum : " + Math.min(num1, num2));


    }

}
