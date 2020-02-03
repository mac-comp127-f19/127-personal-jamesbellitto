package basicjava;

import java.util.List;

public class stringtest {

    public static void main(String[] args) {
        List<String> magicWords = List.of("hocus", "pocus", "abracadabra");

        List<String> people = List.of("sally", "fred");
        for (String word : magicWords) {
            for (String person : people) {
                System.out.println(person + " says " + word + "!");
            }
        }

    }}