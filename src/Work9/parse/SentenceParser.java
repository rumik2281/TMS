package Work9.parse;

public class SentenceParser {
    public static String[] parse(String str) {
        return str.split("(?<=[.!?])\\s*");
    }
}
