package io.lsn.app.task1;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.naturalOrder;

public class Result {

    private final TreeSet<Integer> sorted;
    private final Integer count;
    private final Integer distinct;
    private final Integer min;
    private final Integer max;

    public Result(List<Integer> input) {
        sorted = new TreeSet<>(input);
        count = input.size();
        distinct = sorted.size();
        min = sorted.stream().min(naturalOrder()).get();
        max = sorted.stream().max(naturalOrder()).get();
    }

    @Override
    public String toString() {
        return sorted.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")) + System.lineSeparator() +
                "count: " + count + System.lineSeparator() +
                "distinct: " + distinct + System.lineSeparator() +
                "min: " + min + System.lineSeparator() +
                "max: " + max;
    }
}
