package Work9;

import Work9.file.FileWorker;
import Work9.format.TextFormatter;

import java.util.ArrayList;

public class Palindromes {
    public static void main(String[] args) {
        FileWorker fWorker = new FileWorker();
        ArrayList<String> lines = fWorker.readFromFile("./file.txt");
        System.out.println(lines);
        TextFormatter.removeNonPalindromes(lines);
    }
}
