package exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
    Example terms

    1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

    Fib(0)  = 1
    Fib(1)  = 2
    Fib(2)  = Fib(0) + Fib(1)
    Fib(3)  = Fib(2) + Fib(1)
    ...
    Fib(n)  = Fib(n - 1) + Fib(n - 2)

    Probably go all the way down the list
 */
class FibonacciSequenceGenerator {

    List<Integer> apply(int upperBound) {
        List<Integer> resultList = new ArrayList<>();

        if(upperBound < 1) {
            return resultList;
        }

        resultList.add(1);

        if(upperBound < 2) {
            return resultList;
        }

        resultList.add(2);

        return generateSequence(upperBound, resultList);
    }

    private List<Integer> generateSequence(int upperBound, List<Integer> existingList) {
        int existingListSize = existingList.size();
        int newTerm = existingList.get(existingListSize - 1) + existingList.get(existingListSize - 2);

        if(newTerm >= upperBound) {
            return existingList;
        }

        existingList.add(newTerm);

        return generateSequence(upperBound, existingList);
    }
}
