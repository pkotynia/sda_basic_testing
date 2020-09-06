package exercise.task_01;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @Test
    void shouldAdd() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.add(1, 1);

        //then
        assertThat(result).isEqualTo(2);
    }

    @Test
    void shouldDivide() {
        //given
        Calculator calculator = new Calculator();

        //when
        double result = calculator.divide(1.0, 3.0);

        //then
        assertThat(result).isCloseTo(0.33, Offset.offset(0.01));
    }

}