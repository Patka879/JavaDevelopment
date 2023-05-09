

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.example.advancedDevelopment.task1.ListOfStrings.sortStrings;
import static org.example.advancedDevelopment.task2.IgnoreCaseSort.ignoreCaseSorting;


public class MainTests {
    @Test
    public void shouldBeReturningDescendingOrder() {
        // given
        List<String> list = new ArrayList<>(Arrays.asList("aw", "ba", "cddd"));

        // when
        List<String> answer = sortStrings(list);

        // then
        assertThat(answer).containsExactly("cddd", "ba", "aw");
    }

    @Test
    public void shouldBeReturningDescendingOrderIgnoringCase() {
        // given
        List<String> list = new ArrayList<>(Arrays.asList("Aw", "ba", "Cddd"));

        // when
        List<String> answer = ignoreCaseSorting(list);

        // then
        assertThat(answer).containsExactly("Cddd", "ba", "Aw");
    }
}
