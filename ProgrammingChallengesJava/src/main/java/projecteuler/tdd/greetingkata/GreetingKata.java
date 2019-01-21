package projecteuler.tdd.greetingkata;

public class GreetingKata {

    public String greet(String ... names) {

        if(names == null) {
            return  "Hello, my friend.";
        }

        String greeting = "Hello,";
        String closingPunctuation = ".";

        if(names.length == 1) {
            String firstName = names[0];
            if (firstName.equals(firstName.toUpperCase())) {
                greeting = "HELLO";
                closingPunctuation = "!";
            }
        }

        StringBuilder stringBuilder = new StringBuilder(greeting + " ");
        for(int i = 0; i < names.length; i++) {

            String name = names[i];

            if(name == null) {
                name = "my friend";
            }

            stringBuilder.append(name);
            if(i != names.length - 1) {
                stringBuilder.append(" and ");
            }
        }

        return stringBuilder.append(closingPunctuation).toString();
    }
}
