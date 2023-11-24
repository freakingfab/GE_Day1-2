import java.util.Scanner;

public class HarmonicMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        scanner.close();

        if (N != 0) {
            double harmonicValue = 0;
            for (int i = 1; i <= N; i++) {
                harmonicValue += 1.0 / i;
            }
            System.out.println("The " + N + "th Harmonic Value is: " + harmonicValue);
        } else {
            System.out.println("Invalid input. N should be non-zero.");
        }
    }
}
    

