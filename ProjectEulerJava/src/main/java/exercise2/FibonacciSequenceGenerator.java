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

    List<Integer> apply(int i) {
        return generateSequence(i, new ArrayList<>());
    }

    private List<Integer> generateSequence(int i, List<Integer> existingList) {
        if(i == 0) {
            existingList.add(1);
            return existingList;
        }
        if(i == 1) {
            existingList.add(1);
            existingList.add(2);
            return existingList;
        }
        // New list is equal to the old list plus the new term, which is the last two terms of the old list
        List<Integer> previousSequence = generateSequence(i - 1, existingList);
        int previousSequenceSize = previousSequence.size();
        int newTerm = previousSequence.get(previousSequenceSize - 1) + previousSequence.get(previousSequenceSize - 2);
        existingList.add(newTerm);
        return existingList;
    }
}
