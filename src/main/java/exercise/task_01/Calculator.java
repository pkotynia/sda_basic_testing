package exercise.task_01;

/**
 * Stwórz klasę Calculator, w której zaimplementujesz działania:
 *
 * dodawanie,
 * odejmowanie,
 * mnożenie,
 * dzielenie.
 *
 * Następnie stwórz klasę CalculatorTest, w której przetestujesz powyższe metody.
 *
 */

public class Calculator {

    public int add(int summand1, int summand2) {
        return summand1 + summand2;
    }

    public double divide(double dividend, double divisor) {
        return dividend/divisor;
    }
}
