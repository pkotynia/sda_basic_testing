package exercise.task_03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ArrayExampleTest {

    @Test
    @DisplayName("should throw exception for null argument")
    void nullArgument() {
        //given
        ArrayExample arrayExample = new ArrayExample();

        //when then
        assertThatThrownBy(() -> arrayExample.removeDuplicates(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("array can't be null");
    }

    @Test
    void removeDuplicate() {
        //given
        ArrayExample arrayExample = new ArrayExample();

        //when
        String[] result = arrayExample.removeDuplicates(new String[]{"a", "b", "a"});

        //then
        assertThat(result).isEqualTo(new String[]{"a", "b"});

        //when
        String[] result1 = arrayExample.removeDuplicates(new String[]{"a", "b", "a", "c"});
        assertThat(result1).isEqualTo(new String[]{"a", "b", "c"});
    }

}