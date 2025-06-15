import java.util.Scanner;

public class Oddandeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Positive Number");
        double Number = input.nextDouble();

        if(Number %2 ==0){
            System.out.println("you choose no is an even no");
        }else{
            System.out.println("You choose no is an odd no");
        }


        
    }
}
