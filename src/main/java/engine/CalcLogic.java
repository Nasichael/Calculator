package engine;

import static engine.Operation.*;

public class CalcLogic {


    public static final String THE_SECOND_NUMBER_CAN_NOT_BE_ZERO = "The second number can not be zero";

    double calculate(int number1, int number2, Operation operation) {

        if (operation == PLUS) {
            return (number1 + number2);
        } else if (operation == MINUS) {
            return (number1 - number2);
        } else if (operation == MULTIPLY) {
            return (number1 * number2);
        } else if (operation == DIVIDE) {
            if (number2 != 0) {
                return ((double) number1 / (double) number2);
            } else {
                // System.out.println("Forbiden operation! ");
                throw new CalculateException(THE_SECOND_NUMBER_CAN_NOT_BE_ZERO);
            }
        }
        throw new IllegalStateException("No such an operation");
    }
}



