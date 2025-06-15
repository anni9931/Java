import java.util.Scanner;

public class BitwiseOperator { // ** And(&) **

    // public static void main(String[] args){
    // Scanner input = new Scanner(System.in);
    // System.out.println("showasting Bitwise And operator\n");
    // System.out.println("Please enter the first number : " );
    // int first = input.nextInt();
    // System.out.println("Now, enter the other number :");
    // int second = input.nextInt();

    // int result = first & second;
    // System.out.println(result);
    // }

    // ** OR (|) **

    // public static void main(String[] args) {
    // Scanner input = new Scanner(System.in);
    // System.out.println("Showasting Bitwise Or operator\n");
    // System.out.println("please enter the first number:");
    // int first = input.nextInt();
    // System.out.println("Now,enter the other number:");
    // int second = input.nextInt();

    // int result = first | second;
    // System.out.println(result);
    // }

    // ** Left shift **
    // public static void main(String[] args) {
    //     Scanner input = new Scanner(System.in);
    //     System.out.println("Welcome to showcase RightShift Operator\n");
    //     System.out.println("Press Enter Your Number");
    //     int num = input.nextInt();

    //     int result = num >> 3;
    //     System.out.println(result);

    // }

    // ** Right shift **

      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase leftShift Operator\n");
        System.out.println("Press Enter Your Number");
        int num = input.nextInt();

        int result = num << 3;
        System.out.println(result);

    }
}