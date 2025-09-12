
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int numbers = 0;
        int sum = 0;
        double average = 0;

        while (true) {
            number = Integer.valueOf(scanner.nextLine());
            average = (double) sum / (numbers * 1);

            if (number == 0) {
                if (numbers == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                System.out.println(average);
                break;
            }

            if (number > 0) {
                numbers++;
                sum = sum + number;
            }
        }

    }
}