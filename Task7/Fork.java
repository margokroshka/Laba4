package Laba4.Task7;

class Fork {
    private boolean taken = false;

    synchronized void pickUp() throws InterruptedException {
        while (taken) {
            wait();
        }
        taken = true;
    }

    synchronized void putDown() {
        taken = false;
        notifyAll();
    }
}
