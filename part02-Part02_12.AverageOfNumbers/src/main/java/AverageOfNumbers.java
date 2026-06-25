
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int numberOfEingabe = 0;

        while (true) {
            System.out.println("Give a number:");
            int eingabe = scanner.nextInt();

            if (eingabe == 0) {
                break;
            } else {
                sum += eingabe;
                numberOfEingabe++;
            }
        }

        System.out.println("Average of the numbers: " + (sum / numberOfEingabe));
    }
}
