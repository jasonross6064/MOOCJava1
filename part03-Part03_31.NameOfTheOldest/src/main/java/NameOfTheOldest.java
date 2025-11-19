
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        String name = "";
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] breaker = input.split(",");
            
            if (Integer.valueOf(breaker[1]) > oldest) {
                oldest = Integer.valueOf(breaker[1]);
                name = breaker[0];
            } 
            
        }
        
        System.out.println("Name of the oldest: " + name);
        
        
        
    }
}
