import java.util.Scanner;

public class Ifelse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // // boolean isMale = false;
        // // boolean isanIndian = true;

        // int a = 33;
        // int b =99;

        // System.out.println("before if");
        // if (a<=b) {
        // // System.out.println("proud of Indian");
        // if (a>b) {
        // System.out.println("a is greater than b");

        // } else {
        // System.out.println("b is greater than a");
        // }
        // }

        System.out.println(" Chosse Enter a number");
        double Number = input.nextDouble();

        if (Number>=0){
            System.out.println("you chosen no is positive");
        } else if(Number <=0){
            System.out.println("you chosen number is negative");
        }else{
            System.out.println("you chosen no is positive");
        }
        

      } 

    }

