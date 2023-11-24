import java.util.Scanner;

public class HalfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        
        for (int i = 0; i < size / 2; i++) {
            sumFirstHalf += array[i];
        }
        
        for (int i = size / 2; i < size; i++) {
            sumSecondHalf += array[i];
        }
        
        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("Sum of first half and second half is equal.");
        } else {
            System.out.println("Sum of first half and second half is not equal.");
        }
    }
}
    
