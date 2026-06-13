
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int eingabe = scan.nextInt();

        System.out.println("Give a number:");

        if (eingabe <= 0) {
            System.out.println("The number is not positive.");
        } else {
            System.out.println("The number is positive.");
        }
    }
}
