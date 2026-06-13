
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int eingabe = scan.nextInt();

        if (eingabe < 0) {
            System.out.println("impossible!");
        } else if (eingabe >= 0 && eingabe <= 49) {
            System.out.println("failed");
        } else if (eingabe >= 50 && eingabe <= 59) {
            System.out.println("1");
        } else if (eingabe >= 60 && eingabe <= 69) {
            System.out.println("2");
        } else if (eingabe >= 70 && eingabe <= 79) {
            System.out.println("3");
        } else if (eingabe >= 80 && eingabe <= 89) {
            System.out.println("4");
        } else if (eingabe >= 90 && eingabe <= 100) {
            System.out.println("5");
        } else {
            System.out.println("incredible!");
        }

    }
}
