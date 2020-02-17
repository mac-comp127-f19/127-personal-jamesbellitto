package activityStarterCode.objects;

import java.util.Random;
import java.util.Scanner;

public class Die {
    private Random random = new Random();

    public int currentnumber, maxnumber;

    public Die() {
        currentnumber = -1;
        maxnumber = 6;
    }

    public int setsides(int numbersides){
        this.maxnumber = numbersides;
    }

    public void roll() {
        this.currentnumber = random.nextInt(6) + 1;
    }

    public int getValue() {
        return this.currentnumber;
    }

    @Override
    public String toString() {
//        switch (currentnumber) {
//            case 1:
//                return "one";
//                break;
//            case 2:
//                return "two";
//                break;
//            case 3:
//                return "three";
//                break;
//            case 4:
//                return "four";
//                break;
//            case 5:
//                return "five";
//                break;
//            case 6:
//                return "six";
//                break;
//            default:
//                return "This dice has never been rolled";
//                break;
        if (currentnumber == 1){
            return "one";
        }
        else if (currentnumber == 2){
            return "two";
        }
        else if (currentnumber == 3){
            return "three";
        }
        else if (currentnumber == 4){
            return "four";
        }
        else if (currentnumber == 5){
            return "five";
        }
        else if (currentnumber == 6){
            return "six";
        }
        else if (currentnumber == 7){
            return "seven";
        }
        else if (currentnumber == 8){
            return "eight";
        }
        else if (currentnumber == 9){
            return "nine";
        }
        else if (currentnumber == 10){
            return "ten";
        }
        else if (currentnumber == 11){
            return "eleven";
        }
        else if (currentnumber == 12){
            return "twelve";
        }
        else {
            return "Number out of range";
        }


    }
}
