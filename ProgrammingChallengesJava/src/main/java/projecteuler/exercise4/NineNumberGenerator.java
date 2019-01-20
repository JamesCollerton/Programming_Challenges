package projecteuler.exercise4;

public class NineNumberGenerator {

    /*
        TODO: Decide how to handle NumberFormatException
     */
    public int apply(int length) {
        if(length == 0) {
            return 0;
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < length; i++) {
            stringBuilder.append("9");
        }

        return Integer.parseInt(stringBuilder.toString());
    }

}
