
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number;
        int numbers = 0;
        int sum = 0;
        double average = 0;
        
        while (true) {
            System.out.println("Give a number:");
            number = Integer.valueOf(scanner.nextLine());
            
            average = (double) sum / (numbers * 1);
            
            if (number == 0) {
                System.out.println("Average of the numbers: " + average);
                break;
            }
            
            sum = sum + number;
            numbers++;
            
        }
    }
}
