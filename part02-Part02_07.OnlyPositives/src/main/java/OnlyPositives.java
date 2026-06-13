
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number:");
            int eingabe = scanner.nextInt();

            if (eingabe < 0) {
                System.out.println("Unsuitable number");
            }

            if (eingabe == 0) {
                break;
            }

            if (eingabe > 0) {
                System.out.println((eingabe * eingabe));
            }
        }

    }
}
