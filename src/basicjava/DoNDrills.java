package basicjava;

public class DoNDrills {

    public static void main(String[] args) {

        for (int x = 0; x < 10; x++) {

            System.out.println(x);

        }

        for (int y = 10; y > -1; y--) {
            System.out.println(y);
        }

        for (int z = 1; z < 257; z = z*2){

            System.out.println(z);
        }

        for (int a =1; a <258; a = a*2){
            System.out.println(a-1);
        }


        for (double b = 25; b == -1; b = b - 2){
            System.out.println(Math.sqrt(b));

        }

    }
}
