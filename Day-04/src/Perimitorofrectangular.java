import java.util.Scanner;

public class Perimitorofrectangular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("print side A of rectangular :");
        double first = input.nextDouble();
        System.out.println("Enter side B of rectangular :");
        double second = input.nextDouble();
        System.out.println("Enter side C of rectangular :");
        double third = input.nextDouble();
        System.out.println("Enter side D of rectangular :");
        double forth = input.nextDouble();

        double Perimitorofrectangular = (first + second + third + forth);
        System.out.println(Perimitorofrectangular);
    }
}
