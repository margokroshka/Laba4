package Laba4.Task2;

public class Main {
    public static void main(String[] args){
        lab7.task2.NumberStorage storage1 = new lab7.task2.NumberStorage();
        storage1.addNumber(4.654);
        storage1.addNumber(7);
        storage1.addNumber(-3.9);
        storage1.addNumber(314);
        storage1.addNumber(4.1);
        storage1.addNumber(0);
        storage1.addNumber(0.987987);
        storage1.addNumber(-777);

        storage1.showStorage();

        storage1.removeNumber(-777.0);
        storage1.removeNumber(0);

        storage1.showStorage();

        System.out.println(storage1.findClosest(4.654));
    }
}
