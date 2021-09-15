package Work6.util;

import java.util.Random;

public class NumberGenerator {
    public int generate() {
        Random random = new Random();
        return random.nextInt(2);
    }
}
