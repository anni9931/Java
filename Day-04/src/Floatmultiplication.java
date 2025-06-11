import java.util.Scanner;

public class Floatmultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("We are doing Float Multiplication\n");
        System.out.println("please enter first decimal number :");
        double first = input.nextDouble();
        System.out.println("Now, please enter second number :");
        double second = input.nextDouble();
        System.out.println("\n Result is : " + (first * second));

    }
}
