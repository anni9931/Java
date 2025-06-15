import java.util.Scanner;

public class Greaterthanthree {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three number A,B and C");
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();

        if (A >= B && A >= C) {
            System.out.println("greatest Number is A" + A);
        } else if (B >= C) {
            System.out.println("greatest Number is B" + B);
        } else {
            System.out.println("greatest Number is C" + C);
        }

    }
}
