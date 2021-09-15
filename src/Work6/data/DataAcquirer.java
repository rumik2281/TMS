package Work6.data;

import Work6.exception.InputDataTypeException;
import Work6.exception.InputStreamConsoleException;
import Work6.exception.WrongInputException;
import Work6.util.NumberGenerator;
import Work6.validator.DataValidator;
import Work6.view.impl.ConsoleMessagePrinter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DataAcquirer {
    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private final ConsoleMessagePrinter consoleMessagePrinter = new ConsoleMessagePrinter();

    public int readNum(int leftBorder, int rightBorder) throws InputStreamConsoleException, InputDataTypeException, WrongInputException, IOException {
        DataValidator dataValidator = new DataValidator();
        consoleMessagePrinter.printChooseString(leftBorder, rightBorder);
        int number;
        try {
            number = Integer.parseInt(bufferedReader.readLine());
        } catch (NumberFormatException e) {
            throw new InputDataTypeException();
        } catch (IOException e) {
            throw new InputStreamConsoleException();
        }
        if (!dataValidator.isChoiceCorrect(number, leftBorder, rightBorder)) {
            throw new WrongInputException();
        }
        return number;
    }

    public int getChoice(int leftBorder, int rightBorder) throws InputStreamConsoleException, InputDataTypeException, WrongInputException, IOException {
        int choice;
        try {
            choice = readNum(leftBorder, rightBorder);
        } catch (InputStreamConsoleException | WrongInputException | InputDataTypeException | IOException e) {
            System.out.println(e.toString());
            choice = getChoice(leftBorder, rightBorder);
        }
        return choice;
    }

    public boolean compareChoice() throws InputStreamConsoleException, InputDataTypeException, IOException, WrongInputException {
        int choice = getChoice(0, 1);
        NumberGenerator numberGenerator = new NumberGenerator();
        int gen = numberGenerator.generate();
        System.out.println(gen);
        return choice == gen;
    }

    public int getMenuOption() throws InputStreamConsoleException, InputDataTypeException, IOException, WrongInputException {
        return getChoice(1, 4);
    }

}


