import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int numFlips = -1;
        Scanner scanner = new Scanner(System.in);
        while (numFlips <= 0) {
            System.out.println("Enter the number of times to flip the coin: ");
            numFlips = scanner.nextInt();
        }
        int numHeads = 0;
        int numTails = 0;

        Random random = new Random();
        for (int i = 0; i < numFlips; i++) {
            double randomValue = random.nextDouble();
            if (randomValue < 0.5) {
                numTails++;
            } else {
                numHeads++;
            }
        }

        double headPercentage = (double) numHeads / numFlips * 100;
        double tailPercentage = (double) numTails / numFlips * 100;

        System.out.println("Percentage of Heads: " + headPercentage);
        System.out.println("Percentage of Tails: " + tailPercentage);
    }
}
