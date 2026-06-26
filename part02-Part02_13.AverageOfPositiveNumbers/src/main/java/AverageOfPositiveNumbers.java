
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int number = 0;

        while (true) {
            int eingabe = scanner.nextInt();

            if (eingabe == 0 && sum == 0) {
                System.out.println("Cannot calculate average");
                break;
            } else if (eingabe == 0 && sum != 0) {
                System.out.println((sum / number));
                break;
            } else if (eingabe > 0) {
                sum += eingabe;
                number++;
            }
        }
    }
}
