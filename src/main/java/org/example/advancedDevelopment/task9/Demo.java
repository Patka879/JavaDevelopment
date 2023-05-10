package org.example.advancedDevelopment.task9;

public class Demo {
    public static void main(String[] args) {
        JoinerInteger joinerInteger = new JoinerInteger(",");
        System.out.println(joinerInteger.join(1,2,3,4));

        JoinerString joinerString = new JoinerString("-");
        System.out.println(joinerString.join("1","2","3","4"));
    }

}
