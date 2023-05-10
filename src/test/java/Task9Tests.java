import org.example.advancedDevelopment.task9.Joiner;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task9Tests {
    @Test
    public void testJoiner(){
        Joiner joiner = new Joiner("-");
        String result = joiner.join("dog", "cat", "fish");
        assertThat(result).isEqualTo("dog-cat-fish");
    }
}
