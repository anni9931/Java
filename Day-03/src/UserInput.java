import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(input);
        System.out.println("Now, please enter the first number");
        int firstNum = input.nextInt();
        System.out.println(" Now, Enter second number");
        int secondNum = input.nextInt();
        System.out.println(firstNum + secondNum);

    }
}

