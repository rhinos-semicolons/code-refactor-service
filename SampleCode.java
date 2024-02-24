public class SampleCode {


    private int unusedVariable;

    public static void main(String[] args) {
        System.ou.println("Dirty Code");

        // Division by zero
        int divisionResult = divideNumbers(10, 0);
    }


    // Division by zero not handled
    private static int divideNumbers(int a, int b) {
        return a / b;
    }
}