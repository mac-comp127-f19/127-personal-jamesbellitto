package basicjava;
import java.util.Scanner;
public class Hypotenuse {

    public static double calculateHypotenuse (double length1, double length2) {
        return (Math.sqrt ((length1 * length1) + (length2 * length2)));

    }

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        double input1 = scanner.nextDouble();
        double input2 = scanner.nextDouble();
        System.out.println(calculateHypotenuse(input1, input2));

    }
}
