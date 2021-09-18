package Work9;

import Work9.entity.Car;

import java.io.*;
import java.util.Arrays;

public class CarSerializerApp {
    static void serialize(Car[] cars) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cars.dat"));
            oos.writeObject(cars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Car[] deserialize() {
        Car[] newCars = new Car[0];
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cars.dat"));
            newCars = (Car[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Car car : newCars) {
            System.out.println(car.getName());
        }
        return newCars;
    }

    public static void main(String[] args) {
        Car firstCar = new Car("Audi", 280, 36000);
        Car secondCar = new Car("Fiat", 210, 8000);
        Car thirdCar = new Car("Suzuki", 220, 6850);
        Car[] cars = {firstCar, secondCar, thirdCar};
        serialize(cars);
        Car[] newCars = deserialize();
        System.out.println(Arrays.toString(newCars));
    }
}
