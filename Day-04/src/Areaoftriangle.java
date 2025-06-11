import java.util.Scanner;

public class Areaoftriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  Base and Height of triangle :");
        double Base = input.nextDouble();
        double Height = input.nextDouble();

        double Areaoftriangle = (Base * Height) / 2;
        System.out.println(Areaoftriangle);

    }
}
