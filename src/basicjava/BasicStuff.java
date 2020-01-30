package basicjava;

public class BasicStuff {

    public static void main(String[] args){
        double age0 = 20;
        double age1 = 21;
        System.out.println("We are " + age0 + " and " + age1 + " years old!");

        double sumOfAges = age0 + age1;
        System.out.println("The sum of our ages is " + sumOfAges + "!");

        System.out.println("The sum of our ages is " + (age0 + age1) + "!");

        System.out.println(6/3);
        System.out.println(6/4);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE - 1);

        int numofhours = 1600;
        int numofdays = numofhours/24;
        int numofweeks = numofdays/7;

    }
}
