package Work6.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWorker {
    public int readResource() throws IOException {
        FileReader fr = new FileReader("file1.txt");
        Scanner scan = new Scanner(fr);
        int resource = Integer.parseInt(scan.nextLine());
        fr.close();
        return resource;
    }

    public void writeResource(int resource) throws IOException {
        FileWriter nFile = new FileWriter("file1.txt");
        nFile.write(String.valueOf(resource));
        nFile.close();
    }
}
