package Work8.util;

import java.util.Random;

public class RandomNumberGenerator {
    public int generate() {
        Random rand = new Random();
        return rand.nextInt(21);
    }
}
