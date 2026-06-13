
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInt = Integer.valueOf(scanner.nextLine());
        int secondInt = Integer.valueOf(scanner.nextLine());

        System.out.println((Math.sqrt(firstInt + secondInt)));

    }
}
