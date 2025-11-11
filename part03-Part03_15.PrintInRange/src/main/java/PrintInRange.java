
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLine, int upperLine) {
        for (int number: numbers) {
            if (number >= lowerLine && number <= upperLine) {
                System.out.println(number);
            }
        }
    }
    
}
