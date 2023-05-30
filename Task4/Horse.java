package Laba4.Task4;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Horse extends Animal implements Serializable {
    private double weight;

    public Horse(String food, String location) {
        super(food, location);
    }

    public Horse(String food, String location, double weight) {
        this(food, location);
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        if (!super.equals(o)) return false;

        Horse horse = (Horse) o;

        return Double.compare(horse.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food: '" + getFood() + '\'' +
                ", location: '" + getLocation() + '\'' +
                ", weight = " + weight +
                '}';
    }

    private void writeObject(ObjectOutputStream os) {
        try {
            os.defaultWriteObject();
            os.writeObject(getFood());
            os.writeObject(getLocation());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void readObject(ObjectInputStream is) {
        try {
            is.defaultReadObject();
            this.setFood((String) is.readObject());
            this.setLocation((String) is.readObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
