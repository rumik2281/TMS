package Work6.entity;

import Work6.data.DataAcquirer;
import Work6.exception.InputDataTypeException;
import Work6.exception.InputStreamConsoleException;
import Work6.exception.WrongInputException;
import Work6.file.FileWorker;
import Work6.view.impl.ConsoleMessagePrinter;

import java.io.IOException;

import static java.lang.System.exit;

public class Computer {
    private final String processor = "Intel core i5";
    private final int RAM = 8;
    private final int ROM = 512;
    private int resource;
    private final int maxResource = 10;
    private boolean isDestroyed = false;
    FileWorker fileWorker = new FileWorker();
    DataAcquirer dataAcquirer = new DataAcquirer();
    ConsoleMessagePrinter consoleMessagePrinter = new ConsoleMessagePrinter();

    public Computer() throws IOException {
        resource = fileWorker.readResource();
        if (resource > maxResource) {
            isDestroyed = true;
            consoleMessagePrinter.printBrokenString();
            exit(1);
        }
    }

    public void powerOn() throws InputStreamConsoleException, InputDataTypeException, WrongInputException, IOException {
        if (!isDestroyed) {
            if (dataAcquirer.compareChoice()) {
                consoleMessagePrinter.printPowerOnString();
                resource++;
                fileWorker.writeResource(resource);
            } else {
                consoleMessagePrinter.printBrokenString();
                isDestroyed = true;
            }
        }
    }

    public void powerOff() throws InputStreamConsoleException, InputDataTypeException, WrongInputException, IOException {
        if (!isDestroyed) {
            if (dataAcquirer.compareChoice()) {
                consoleMessagePrinter.printPowerOffString();
                resource++;
                fileWorker.writeResource(resource);
            } else {
                consoleMessagePrinter.printBrokenString();
                isDestroyed = true;
            }
        }
    }

    @Override
    public String toString() {
        return "[processor = " + processor
                + ", RAM = " + RAM
                + ", ROM = " + ROM
                + ", resource = " + resource + "]";
    }


}
