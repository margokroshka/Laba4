package Laba4.Task4;

import java.io.File;

public class Demo {
    public static void main(String[] args) {
        Horse horse = new Horse("Овес", "Конеферма", 450.0);
        File file = new File("src\\Laba4\\Task4\\horse.txt");
        Ser.serialize(horse, file);
        Horse newHorse = (Horse) Ser.deserialize(file);
        System.out.println(newHorse);
    }
}
