package basicjava;

public class Dummy {

    public static void main(String[]args){
        double toconvert = 47.36;
        double dollarsincents = toconvert*100;
        double splitcents = dollarsincents%100;
        double splitdollars = dollarsincents - splitcents;

        double splittens = (splitdollars - splitdollars%1000);
        System.out.println(splittens/1000 + " ten dollar bills");

        double newdollarremainder = splitdollars - splittens;

        double splitfives = (newdollarremainder - newdollarremainder%500);
        System.out.println(splitfives/500 + " five dollar bills");

        newdollarremainder = splitdollars - splittens - splitfives;
        System.out.println(newdollarremainder);

        double splitones = newdollarremainder/100;
        System.out.println(splitones + " one dollar bills");


        System.out.println(splitcents + " splitcents");
        double splitquarters = (splitcents - splitcents%25);
        System.out.println(splitquarters + " quarters");
        double newcentremainder = splitcents - splitquarters;

        double splitdimes = (newcentremainder - newcentremainder%10);
        System.out.println(splitdimes + " dimes");
        newcentremainder = splitcents - splitquarters - splitdimes;

        double splitnickles = (newcentremainder- newcentremainder%5);
        System.out.println(splitnickles + " nickles");
        newcentremainder = splitcents - splitquarters - splitdimes - splitnickles;

        System.out.println (newcentremainder + " pennies");

    }
}
