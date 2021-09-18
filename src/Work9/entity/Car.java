package Work9.entity;

import java.io.Serializable;

public class Car implements Serializable {
    private String name;
    private int speed;
    private int price;

    public Car(String name, int speed, int price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return ("(" + this.name + " " + this.speed + " " + this.price + ")");
    }
}
