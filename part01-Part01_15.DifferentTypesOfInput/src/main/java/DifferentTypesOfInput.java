
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String strEingabe = scan.nextLine();

        System.out.println("Give an integer:");
        Integer intEingabe = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double:");
        Double doubleEingabe = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean:");
        Boolean boolEingabe = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + strEingabe);
        System.out.println("You gave the integer " + intEingabe);
        System.out.println("You gave the double " + doubleEingabe);
        System.out.println("You gave the boolean " + boolEingabe);

    }
}
