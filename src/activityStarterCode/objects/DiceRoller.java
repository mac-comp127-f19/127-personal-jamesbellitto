package activityStarterCode.objects;

public class DiceRoller {

    public static void main(String[]args){

        Die die1 = new Die();

        Die die2 = new Die();

        int matchcounter = 0;

        for(int z = 1;z < 11; z++){
            die1.roll();
            System.out.println("Roll " + z + " generated a " + die1.toString());
            }

        for(double z = 1; z< 1000000; z++) {
            die1.roll();
            die2.roll();
            if (die1.getValue() == die2.getValue()) {
                matchcounter++;
            }
        }
        System.out.println("In 1,000,000 rolls, two dice agreed " + matchcounter + " times.");




    }
}
