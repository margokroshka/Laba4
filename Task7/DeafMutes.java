package Laba4.Task7;

class DeafMutes extends Thread {
    final int id;
    final Fork leftFork;
    final Fork rightFork;

    DeafMutes(int id, Fork leftFork, Fork rightFork) {
        this.id = id;
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    private void pickUpForks() throws InterruptedException {
        if (id % 2 == 0) {
            leftFork.pickUp();
            rightFork.pickUp();
        } else {
            rightFork.pickUp();
            leftFork.pickUp();
        }
        System.out.println("Глухонемой " + id + "взял вилки");
    }

    private void putDownForks() {
        leftFork.putDown();
        rightFork.putDown();
        System.out.println("Глухонемой" + id + "положил вилки");
    }

    private void eat() throws InterruptedException {
        System.out.println("Глухонемой " + id + " ест");
        Thread.sleep(2000);
    }

    private void think() throws InterruptedException {
        System.out.println("Глухонемой" + id + "жестикулирует");
        Thread.sleep(2000);
    }

    @Override
    public void run() {
        try {
            while (true) {
                think();
                pickUpForks();
                eat();
                putDownForks();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}