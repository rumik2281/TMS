package Work6.view;

import Work6.entity.Computer;

public interface MessagePrinter {
    void printDescription(Computer computer);

    void printChooseString(int leftBorder, int rightBorder);

    void printPowerOnString();

    void printPowerOffString();

    void printBrokenString();

    void printMenu();
}
