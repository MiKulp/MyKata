package exercises.SevenKyu.Calculator;

public class CalculatorKata {
    public static Double calculate(final double numberOne, final String operation, final double numberTwo) {

        if (numberTwo == 0.0  && operation.contains("/")) return null;

        switch (operation) {
            case "+" : return numberOne + numberTwo;
            case "/" : return numberOne / numberTwo == -0.0 ? 0.0 : numberOne / numberTwo;
            case "-" : return numberOne - numberTwo;
            case "*" : return numberOne * numberTwo == -0.0 ? 0.0 : numberOne * numberTwo;
            default : return null;
        }

    }
}
