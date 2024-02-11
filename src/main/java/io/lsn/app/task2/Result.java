package io.lsn.app.task2;

import io.lsn.app.model.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Result {

    private static final Integer SUM = 13;
    private final ArrayList<Pair> pairs = new ArrayList<>();

    public Result(List<Integer> input) {
        IntStream.range(0, input.size())
                .forEach(i -> IntStream.range(0, input.size())
                        .filter(j -> i > j && input.get(i) + input.get(j) == SUM)
                        .forEach(j -> pairs.add(new Pair(input.get(i), input.get(j))))
                );
    }

    @Override
    public String toString() {
        return pairs.stream().sorted().map(Pair::toString)
                .collect(Collectors.joining(System.lineSeparator()));
    }

}
