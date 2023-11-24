import java.util.Scanner;
public class ComputeQR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter the value of divisor: ");
        int divisor = scanner.nextInt();
        scanner.close();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}
