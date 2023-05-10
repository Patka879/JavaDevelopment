package org.example.advancedDevelopment.task9;

public class JoinerInteger extends Joiner<Integer> {

    public JoinerInteger(String separator) {
        super(separator);
    }

    @Override
    public String join(Integer... things) {
        String joined = "";
        joined += "{";
        for (int i = 0; i < things.length; i++) {
            joined += (things[i]);
            if (i < things.length - 1) {
                joined += separator;
            }
        }
        joined += "}";
        return joined;
    }
}
