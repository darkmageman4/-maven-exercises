import java.util.InputMismatchException;
import java.util.Scanner;

public class checkIfNumber {
    public static void checkIfNumberIs() {
        try {
            Scanner isANumber = new Scanner(System.in);
            System.out.println("Enter a number!");
            int num = isANumber.nextInt();
            System.out.println("this is a number");
        } catch (InputMismatchException e) {
            System.out.println("This is not a number ");
        }

    }
}
