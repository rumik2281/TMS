package Work9.file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileWorker {
    public ArrayList<String> readFromFile(String fileName) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            lines.add(line);
            while (line != null) {
                line = reader.readLine();
                if (line != null) {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void writeToFile(StringBuilder sb) {
        String outputFileName = "./newFfile.txt";
        try (BufferedWriter writter = new BufferedWriter(new FileWriter(outputFileName))) {
            writter.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readText(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
