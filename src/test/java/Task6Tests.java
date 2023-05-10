import org.example.advancedDevelopment.task6.ConversionType;
import org.example.advancedDevelopment.task6.MeasurementConverter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class Task6Tests {
    @ParameterizedTest
    @MethodSource // we will create new dedicated method when we will add values of arguments
    public void checkConversion(ConversionType type, double expectedValue){
        //when
        double result = MeasurementConverter.convert(50, type);
        //then
        assertThat(result).isEqualTo(expectedValue);
    }

    public static Stream<Arguments> checkConversion() {
        return Stream.of(
                Arguments.of(ConversionType.METERS_TO_YARDS, 54.680665d),
                Arguments.of(ConversionType.INCHES_TO_CENTIMETERS, 127.0d),
                Arguments.of(ConversionType.MILES_TO_KILOMETERS, 80.4672d));
    }
}
