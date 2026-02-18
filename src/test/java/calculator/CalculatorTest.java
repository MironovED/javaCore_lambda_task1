package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Тест на проверку сложения")
    public void testPlus() {
        //given:
        int x = 5;
        int y = 7;
        //when:
        Calculator calc = Calculator.instance.get();
        int result = calc.plus.apply(x, y);
        //then:
        assertEquals(12, result);
    }

    @Test
    @DisplayName("Тест на проверку вычитания")
    public void testMinus() {
        //given:
        int x = 10;
        int y = 3;
        //when:
        Calculator calc = Calculator.instance.get();
        int result = calc.minus.apply(x, y);
        //then:
        assertEquals(7, result);
    }

    @Test
    @DisplayName("Тест на проверку умножения")
    public void testMultiply() {
        //given:
        int x = 5;
        int y = 7;
        //when:
        Calculator calc = Calculator.instance.get();
        int result = calc.multiply.apply(x, y);
        //then:
        assertEquals(35, result);
    }

    @Test
    @DisplayName("Тест на проверку деления")
    public void testDevide() {
        //given:
        int x = 21;
        int y = 7;
        //when:
        Calculator calc = Calculator.instance.get();
        int result = calc.devide.apply(x, y);
        //then:
        assertEquals(3, result);
    }

    @Test
    @DisplayName("Тест на проверку деления на ноль")
    public void testDevideOnZero() {
        //given:
        int x = 21;
        int y = 0;
        //when:
        Calculator calc = Calculator.instance.get();
        //then:
        assertThrows(ArithmeticException.class, () -> calc.devide.apply(x, y));
    }

    @Test
    @DisplayName("Тест на проверку инкримента")
    public void testPow() {
        //given:
        int x = 5;
        //when:
        Calculator calc = Calculator.instance.get();
        int result = calc.pow.apply(x);
        //then:
        assertEquals(25, result);
    }

    @Test
    @DisplayName("Тест на проверку положительного числа")
    public void testIsPositive() {
        //given:
        int x = 1;
        //when:
        Calculator calc = Calculator.instance.get();
        boolean result = calc.isPositive.test(x);
        //then:
        assertTrue(result);
    }

    @Test
    @DisplayName("Тест на hamcrest на проверку положительного числа")
    public void hamcrestTestIsPositive() {
        //given:
        int x = 1;
        //when:
        Calculator calc = Calculator.instance.get();
        boolean result = calc.isPositive.test(x);
        //then:
        assertThat(result, equalTo(true));
    }

    @Test
    @DisplayName("Тест на hamcrest на проверку сложения")
    public void hamcrestTestPlus() {
        //given:
        int x = 1;
        int y = 9;
        //when:
        Calculator calc = Calculator.instance.get();
        int result = calc.plus.apply(x,y);
        //then:
        assertThat(result, is(10));
    }
}