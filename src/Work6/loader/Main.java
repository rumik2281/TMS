package Work6.loader;

import Work6.controller.MenuController;
import Work6.entity.Computer;
import Work6.exception.InputDataTypeException;
import Work6.exception.InputStreamConsoleException;
import Work6.exception.WrongInputException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InputStreamConsoleException, InputDataTypeException, WrongInputException {
        MenuController menu = new MenuController();
        menu.processMenu();
    }
}
