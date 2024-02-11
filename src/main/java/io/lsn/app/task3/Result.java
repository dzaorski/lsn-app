package io.lsn.app.task3;

import io.lsn.app.model.Pair;

import java.util.ArrayList;
import java.util.List;

public class Result {

    private static final int NOT_UPDATED_INDEX = -1;
    private final ArrayList<Graph> graphs = new ArrayList<>();

    public Result(List<Pair> input) {
        Graph current = new Graph();
        current.addPair(input.get(0));
        graphs.add(current);
        for (Pair pair : input) {
            if (!current.update(pair)) {
                int index = NOT_UPDATED_INDEX;
                for (int j = 0; j < graphs.size(); j++) {
                    current = graphs.get(j);
                    boolean isUpdated = current.update(pair);
                    if (isUpdated && index > NOT_UPDATED_INDEX) {
                        current.merge(graphs.get(index));
                        graphs.remove(index);
                    }
                    if (isUpdated) {
                        index = j;
                    }
                }
                if (index == NOT_UPDATED_INDEX) {
                    current = new Graph();
                    current.addPair(pair);
                    graphs.add(current);
                }
            }
        }
    }

    @Override
    public String toString() {
        return String.valueOf(graphs.size());
    }
}
