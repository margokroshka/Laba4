package Laba4.Task7;

public class Main {
    public static void main(String[] args) {
        Fork[] forks = new Fork[5];
        for (int i = 0; i < 5; i++) {
            forks[i] = new Fork();
        }
        DeafMutes[] deafMutes = new DeafMutes[5];
        for (int i = 0; i < 5; i++) {
            Fork leftFork = forks[i];
            Fork rightFork = forks[(i + 1) % 5];
            deafMutes[i] = new DeafMutes(i, leftFork, rightFork);
            deafMutes[i].start();
        }
        try {
            Thread.sleep(10000);
            for (DeafMutes DeafMutes : deafMutes) {
                DeafMutes.interrupt();
            }
            for (DeafMutes DeafMutes : deafMutes) {
                DeafMutes.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
