
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] splitter = input.split(" ");

            for (int i = 0; i < splitter.length; i++) {
                System.out.println(splitter[i]);
            }
        }

    }
}
