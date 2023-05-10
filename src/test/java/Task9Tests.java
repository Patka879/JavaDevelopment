import org.example.advancedDevelopment.task9.Joiner;
import org.example.advancedDevelopment.task9.JoinerInteger;
import org.example.advancedDevelopment.task9.JoinerString;
import org.junit.Test;

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
}
