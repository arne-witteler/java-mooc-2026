
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eingabe = Integer.valueOf(scanner.nextLine());

        if (eingabe < 0) {
            System.out.println((eingabe * -1));
        } else {
            System.out.println(eingabe);
        }
    }
}
