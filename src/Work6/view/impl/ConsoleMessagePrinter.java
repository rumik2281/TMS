package Work6.view.impl;

import Work6.entity.Computer;
import Work6.view.MessagePrinter;

public class ConsoleMessagePrinter implements MessagePrinter {
    @Override
    public void printDescription(Computer computer) {
        System.out.println(computer);
    }

    @Override
    public void printChooseString(int leftBorder, int rightBorder) {
        System.out.printf("Введите число от %d до %d\n", leftBorder, rightBorder);
    }

    @Override
    public void printPowerOnString() {
        System.out.println("Компьютер включён");
    }

    @Override
    public void printPowerOffString() {
        System.out.println("Компьютер выключен");
    }

    @Override
    public void printBrokenString() {
        System.out.println("Компьютер сгорел");
    }

    @Override
    public void printMenu() {
        System.out.print("1. Включить\n2. Выключить\n3. Описание\n4. Выход\n");
    }
}
