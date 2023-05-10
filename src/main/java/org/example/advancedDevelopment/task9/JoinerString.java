package org.example.advancedDevelopment.task9;

public class JoinerString extends Joiner<String> {


    public JoinerString(String separator) {
        super(separator);
    }

    @Override
    public String join(String... things) {
        String joined = "";
        joined += "[";
        for (int i = 0; i < things.length; i++) {
            joined += (i + ":text" + things[i]);
            if (i < things.length - 1) {
                joined += separator;
            }
        }
        joined +="]";
        return joined;
    }
}
