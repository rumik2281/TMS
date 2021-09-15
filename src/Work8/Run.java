package Work8;

import Work8.entity.Car;
import Work8.exception.EngineStartException;
import java.util.Arrays;
import java.util.List;

public class Run {
    private static void startAll(List<Car> carList) {
        for (Car car : carList) {
            try {
                car.start();
            } catch (EngineStartException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Car firstCar = new Car("Nissan", 240, 38000);
        Car secondCar = new Car("Tesla", 320, 63000);
        Car thirdCar = new Car();
        thirdCar.setName("Hyundai");
        thirdCar.setPrice(43000);
        thirdCar.setSpeed(260);
        List<Car> carList = Arrays.asList(firstCar, secondCar, thirdCar);
        startAll(carList);
    }
}
