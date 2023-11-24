import java.util.Scanner;

public class Power2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a input: ");
        int N = scanner.nextInt();
        if (N >= 0 && N < 31) {
            int i = 0;
            int power = 1;
            while (i <= N) {
                System.out.println("2^" + i + " = " + power);
                power *= 2;
                i++;
            }
        } else {
            System.out.println("Invalid input. N should be between 0 and 30.");
        }
    }
}
    

