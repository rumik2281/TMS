package Work8.entity;

import Work8.exception.EngineStartException;
import Work8.util.RandomNumberGenerator;
import Work8.view.ConsoleMessagePrinter;

import static Work8.validator.EvenNumberValidator.isEven;

public class Car {
    private String name;
    private int speed;
    private int price;
    ConsoleMessagePrinter printer = new ConsoleMessagePrinter();

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

    public void checkEngineNumber(int number) throws EngineStartException {
        if (isEven(number)) {
            throw new EngineStartException("Автомобиль не завёлся");
        } else {
            printer.printMessage("Автомобиль с маркой " + this.name + " завёлся");
        }
    }

    public void start() throws EngineStartException {
        RandomNumberGenerator gen = new RandomNumberGenerator();
        int number = gen.generate();
        checkEngineNumber(number);
    }
}
