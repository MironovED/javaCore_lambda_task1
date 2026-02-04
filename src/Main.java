import calculator.Calculator;
/**
 * Приведенный код из задания 1 упадет в ошибку ArithmeticException при выполнении - на ноль делить нельзя:
 * переменная b = 0
 *
 * Несколько решений:
 * 1. перед функцией деления выполнить проверку на ноль переменной b, для этого у нас есть переменная isPositive
 * 2. завернуть код в кострукцию try-catch
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();

        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1,1);
        //int c = calculator.devide.apply(a, b); ошибочная реализация

        // реализация с условием
        if (calculator.isPositive.test(b)) {
            int c = calculator.devide.apply(a, b);
            calculator.println.accept(c);
        }

        // обрабатываем ошибку
        try {
            int c = calculator.devide.apply(a, b);
            calculator.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Арифметическая ошибка! На ноль делить нелья!");
        }
    }
}