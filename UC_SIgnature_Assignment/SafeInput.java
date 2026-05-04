import java.util.Scanner;

public class SafeInput {

    public static int getRangedInt(Scanner console, String prompt, int low, int high) {
        int value = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt + " [" + low + "-" + high + "]: ");
            if (console.hasNextInt()) {
                value = console.nextInt();
                if (value >= low && value <= high) {
                    validInput = true;
                } else {
                    System.out.println("  *** Out of range! Please enter a number between "
                            + low + " and " + high + ". ***");
                }
            } else {
                System.out.println("  *** Invalid input! Please enter a whole number. ***");
                console.next(); 
            }
        }
        return value;
    }

    public static boolean getYNConfirm(Scanner console, String prompt) {
        String response = "";
        boolean validInput = false;

        while (!validInput) {
            System.out.print(prompt + " [Y/N]: ");
            response = console.next().trim();
            if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("N")) {
                validInput = true;
            } else {
                System.out.println("  *** Please enter Y or N. ***");
            }
        }
        return response.equalsIgnoreCase("Y");
    }
}
