import static java.lang.System.out;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Program: Calculator
 *
 * Created by: Jacob San Juan
 * Created on: 09/24/1996
 * Version: 1.0
 *
 * Entire program is in one class, Calculator.
 * Class asks user to choose from a list of mathematical operations.  Checks to see
 * if user input is correct.  If input is correct, calls correct function.  Function
 * will allow user to input two float numbers to be calculated.  User is then prompted
 * to input another number, can choose 5 to exit program.
 *
 * @param userChoice: used to store user's choice of number. Retrieved using Scanner
 *
 * @param getInput: Scanner object, used to get input from user
 */

public class Calculator {

    public static void main(String[] args) {
        int userChoice;

        Scanner getInput = new Scanner(System.in);

        out.println("Welcome to Jacob's simple calculator.  " +
                "Please choose an option below:");
        out.print("\t1. Addition\n\t2. Subtraction\n\t3. Multiplication" +
                "\n\t4. Division\n\t5. Exit\n");

        do {
            System.out.println("Enter your choice between 1 and 5 only: ");
            try {
                userChoice = getInput.nextInt();
                if (userChoice >= 1 && userChoice <= 5) {
                    if (userChoice == 1)
                        out.printf("Your float value is %.2f.\n",
                                addition());
                    else if (userChoice == 2)
                        out.printf("Your float value is %.2f.\n",
                                subtraction());
                    else if (userChoice == 3)
                        out.printf("Your float value is %.2f.\n",
                                multiplication());
                    else if (userChoice == 4)
                        out.printf("Your float value is %.2f\n",
                                division());
                    else if (userChoice == 5) {
                        out.println("Thank you for using Jacob's calculator!");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Please try again.");
                    getInput.nextLine();
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice, please try again.");
                getInput.nextLine();
            }
        } while (true);
    }

    /**
     * Function addition()
     *
     * @param num1: Used to store return value of getFloat() function
     *
     * @param num2: Used to store return value of getfloat() function
     *
     * Do while loop is used to keep prompting user until proper input is received.
     * Try-catch clause used to catch any exceptions.
     *
     * @return Value of num1 + num2
     * */
    static float addition() {
        float num1, num2;

        out.println("You have chosen Addition.");
        out.println("Please enter two floats, separated by a space below. ");
        do {
            try {
                num1 = getFloat();
                num2 = getFloat();
                break;
            } catch (InputMismatchException e) {
                out.println();
            }
        } while (true);
        return num1 + num2;
    }

    /**
     * Function subtraction()
     *
     * @param num1: Used to store return value of getFloat() function
     *
     * @param num2: Used to store return value of getfloat() function
     *
     * Do while loop is used to keep prompting user until proper input is received.
     * Try-catch clause used to catch any exceptions.
     *
     * @return Value of num1 - num2
     * */
    static float subtraction() {
        float num1, num2;

        out.println("You have chosen Subtraction.");
        out.println("Please enter two floats, separated by a space below. ");
        do {
            try {
                num1 = getFloat();
                num2 = getFloat();
                break;
            } catch (InputMismatchException e) {
                out.println();
            }
        } while (true);
        return num1 - num2;
    }

    /**
     * Function multiplication()
     *
     * @param num1: Used to store return value of getFloat() function
     *
     * @param num2: Used to store return value of getfloat() function
     *
     * Do while loop is used to keep prompting user until proper input is received.
     * Try-catch clause used to catch any exceptions.
     *
     * @return Value of num1 * num2
     * */
    static float multiplication() {
        float num1, num2;

        out.println("You have chosen Multiplication.");
        out.println("Please enter two floats, separated by a space below. ");
        do {
            try {
                num1 = getFloat();
                num2 = getFloat();
                break;
            } catch (InputMismatchException e) {
                out.println();
            }
        } while (true);
        return num1 * num2;
    }

    /**
     * Function addition()
     *
     * @param num1: Used to store return value of getFloat() function
     *
     * @param num2: Used to store return value of getfloat() function
     *
     * Do while loop is used to keep prompting user until proper input is received.
     * Try-catch clause used to catch any exceptions.  Uses while loop
     * to make sure that there is not a 0 in num2.
     *
     * @return Value of num1 / num2
     * */
    static float division() {
        float num1, num2;

        out.println("You have chosen Division.");
        out.println("Please enter two floats, separated by a space below. ");
        do {
            try {
                num1 = getFloat();
                num2 = getFloat();
                while (num2 == 0) {
                    out.println("Please enter a nonzero number!");
                    num2 = getFloat();
                }
                break;
            } catch (InputMismatchException e) {
                out.println();
            }
        } while (true);
        return num1 / num2;
    }

    /**
     * Function: getFloat()
     *
     * @param userFloat  Stores float that user inputs.
     *
     * @param getInput  Scanner object, uses nextFloat method to get float
     *                  that user inputs.
     *
     * Function takes in singular float value from a user.
     * Throws InputMismatchException if input is not valid
     *
     * @return userFloat
     */
    static float getFloat() throws InputMismatchException {
        float userFloat;

        Scanner getInput = new Scanner(System.in);
        out.println("Please enter a float value here: ");
        userFloat = getInput.nextFloat();

        return userFloat;
    }
}


