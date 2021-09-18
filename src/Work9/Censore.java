package Work9;

import Work9.file.FileWorker;
import Work9.format.TextFormatter;
import Work9.parse.SentenceParser;

import java.io.IOException;
import java.util.ArrayList;

public class Censore {
    public static void main(String[] args) throws IOException {
        FileWorker fileWorker = new FileWorker();
        ArrayList<String> blackList = fileWorker.readFromFile("./blacklist.txt");
        String[] sentences = SentenceParser.parse(fileWorker.readText("./text.txt"));
        ArrayList<String> censoredSentences = new ArrayList<>();
        for (String s : sentences) {
            if (TextFormatter.checkCensore(s, blackList)) {
                censoredSentences.add(s);
            }
        }
        if (censoredSentences.size() > 0) {
            System.out.println("Текст не прошёл цензуру");
            System.out.println(censoredSentences);
            System.out.println("Количество: " + censoredSentences.size());
        } else {
            System.out.println("Текст прошёл цензуру");
        }

    }
}
