package Work6.controller;

import Work6.data.DataAcquirer;
import Work6.entity.Computer;
import Work6.exception.InputDataTypeException;
import Work6.exception.InputStreamConsoleException;
import Work6.exception.WrongInputException;
import Work6.view.impl.ConsoleMessagePrinter;

import java.io.IOException;

public class MenuController {
    ConsoleMessagePrinter consoleMessagePrinter = new ConsoleMessagePrinter();
    DataAcquirer dataAcquirer = new DataAcquirer();

    public void processMenu() throws InputStreamConsoleException, InputDataTypeException, IOException, WrongInputException {
        consoleMessagePrinter.printMenu();
        processMenuOption(dataAcquirer.getMenuOption());
        processMenu();
    }

    public void processMenuOption(int option) throws IOException, InputStreamConsoleException, InputDataTypeException, WrongInputException {
        Computer computer = new Computer();
        switch (option) {
            case 1 -> computer.powerOn();
            case 2 -> computer.powerOff();
            case 3 -> consoleMessagePrinter.printDescription(computer);
            case 4 -> System.exit(0);
        }
    }
}
