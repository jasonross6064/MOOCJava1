
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int adder = Integer.valueOf(scanner.nextLine());
            if (adder == 9999) {
                break;
            }
            list.add(adder);
        }
        
        int min = list.get(0);
        int minIndex = 0;
        
        for (int i = 0; i < list.size(); i++) {
            int holder = list.get(i);
            if (min > holder) {
                min = holder;
            }
        }
        
        System.out.println("Smallest number: " + min);
        
        for (int i = 0; i < list.size(); i++) {
            if (min == list.get(i)) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
