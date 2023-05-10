import org.example.advancedDevelopment.task9.JoinerInteger;
import org.example.advancedDevelopment.task9.JoinerString;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task9Tests {
    @Test
    public void testIntegerJoiner(){
        JoinerInteger joinerInteger = new JoinerInteger(",");
        String result = joinerInteger.join(1,2,3,4,5);
        assertThat(result).isEqualTo("{1,2,3,4,5}");
    }

    @Test
    public void testStringJoiner() {
        JoinerString joinerString = new JoinerString("-");
        String result = joinerString.join("1","2","3");
        assertThat(result).isEqualTo("[0:text1-1:text2-2:text3]");
    }

    @ParameterizedTest
    @MethodSource
    public void checkMultipleCasesOfIntegerJoiner(String separator, String expectedResult) {
        JoinerInteger joinerInteger = new JoinerInteger(separator);
        String result = joinerInteger.join(0,1,2,3,4);
        assertThat(result).isEqualTo(expectedResult);
    }

    public static Stream<Arguments> checkMultipleCasesOfIntegerJoiner() {
        return Stream.of(
                Arguments.of(",", "{0,1,2,3,4}"),
                Arguments.of("-", "{0-1-2-3-4}")
        );
    }
    @ParameterizedTest
    @MethodSource
    public void checkMultipleCasesOfStringJoiner(String expectedResult, String[] things) {
        JoinerString stringJoiner = new JoinerString("-");
        String result = stringJoiner.join(things);
        assertThat(result).isEqualTo(expectedResult);
    }

    public static Stream<Arguments> checkMultipleCasesOfStringJoiner() {
        return Stream.of(
                Arguments.of("[0:text1-1:text2-2:text3]", new String[]{"1", "2", "3"}),
                Arguments.of("[0:text5-1:text7-2:text9]", new String[]{"5", "7", "9"})
        );
    }
}
