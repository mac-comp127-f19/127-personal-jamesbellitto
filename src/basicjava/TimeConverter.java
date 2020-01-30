package basicjava;

import java.util.Scanner;

public class TimeConverter {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many hours?");
        int hours = scanner.nextInt();
        System.out.println("How many minutes?");
        int minutes = scanner.nextInt();
        System.out.print("How many seconds?");
        int seconds = scanner.nextInt();

        public static int TimeConverter(hours, minutes, seconds){
            return (hours*360) + (minutes*60) + (seconds);

        }
    }


}
