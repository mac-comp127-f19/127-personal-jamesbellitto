package basicjava;
import java.util.Scanner;

public class OddEven {
    public static int isOdd (int input) {
    if (Math.abs(input%2) == 0){
        System.out.println ("That is even");
        }
    else
        System.out.println("that is odd");
     return 0;
    }

    public static int newOddEven(int input) {
        if (Math.abs(input % 2) == 1) {
            System.out.println("Wow, that's odd!");
        }
    return 0;
    }

    public static void main(String[]args) {
        System.out.println ("Please type a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        isOdd(number);


        System.out.println ("Please type a number");
        int number2 = scanner.nextInt();
        newOddEven(number2);
        }



}