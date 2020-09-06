package exercise.task_04;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class EmailValidatorTest {

    @ParameterizedTest
    @CsvSource({"a, false",
            "a@a, false",
            "a@a.com, true"})
    void shouldValidateMail(String mail, boolean expected) {
        //given
        EmailValidator emailValidator = new EmailValidator();

        //when
        boolean result = emailValidator.isMailValid(mail);

        //than
        assertThat(result).isEqualTo(expected);
    }

}