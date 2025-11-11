
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");

        int largest = 0;
        for (int i = 0; i < list.size(); i++) {
            int holder = list.get(i);
            if (holder > largest) {
                largest = holder;
            }
        }
        System.out.println("The greatest number is: " + largest);
    }
}
