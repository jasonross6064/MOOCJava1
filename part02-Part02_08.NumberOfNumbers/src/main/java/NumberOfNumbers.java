
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        int numbers = 0;
        
        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            
            if (number == 0) {
                System.out.println("Number of numbers: " + numbers);
                break;
            }
            numbers++;
            
        }
        
        System.out.println("Number of numbers: " + numbers);
    }
}
