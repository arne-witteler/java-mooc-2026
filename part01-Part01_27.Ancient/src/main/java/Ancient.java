
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int eingabe = scan.nextInt();

        System.out.println("Give a year:");

        if (eingabe < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
