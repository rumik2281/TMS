package Work9.format;

import Work9.file.FileWorker;

import java.io.FileWriter;
import java.util.ArrayList;

public class TextFormatter {
    public static boolean checkPalindrome(String str) {
        return str.equals(new StringBuffer().append(str).reverse().toString());
    }

    public static void removeNonPalindromes(ArrayList<String> lines) {
        StringBuilder sb = new StringBuilder();
        for (String s : lines) {
            if (checkPalindrome(s)) {
                sb.append(s);
                sb.append("\n");
            }
        }
        FileWorker.writeToFile(sb);
    }

    public static boolean checkCensore(String str, ArrayList<String> blackList) {
        String[] words = str.split(" ");
        for (String word : words) {
            for (String bw : blackList) {
                if (word.equalsIgnoreCase(bw)) {
                    return true;
                }
            }
        }
        return false;
    }


}
