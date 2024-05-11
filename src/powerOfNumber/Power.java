package powerOfNumber;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        System.out.println("Enter any Number : ");
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        input.close();
        double square = num * num ;
        System.out.println("Square : "+ square);
        double cube = square * num ;
        System.out.println("Cube : " + cube);
        System.out.println("Fourth : "+ Math.pow(num, 4));

    }
}
