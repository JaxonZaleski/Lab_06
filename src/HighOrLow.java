import java.util.Random;

public class HighOrLow {
    public static void main(String[] args) {

        Random rand = new Random();
        int zeroToNine = rand.nextInt(10);
        int oneToTen = rand.nextInt(10)+1;
        int oneToTenB = rand.nextInt(1,11);
    }
}
