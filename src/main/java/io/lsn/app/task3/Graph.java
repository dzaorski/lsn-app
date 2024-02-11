package io.lsn.app.task3;

import io.lsn.app.model.Pair;

import java.util.HashSet;
import java.util.Set;

public class Graph {

    private final Set<Integer> vertices = new HashSet<>() {
    };

    boolean update(Pair connection) {
        if (contains(connection.getFirst())) {
            vertices.add(connection.getSecond());
            return true;
        } else if (contains(connection.getSecond())) {
            vertices.add(connection.getFirst());
            return true;
        }
        return false;
    }

    void addPair(Pair connection) {
        vertices.add(connection.getFirst());
        vertices.add(connection.getSecond());
    }

    void merge(Graph another) {
        this.vertices.addAll(another.vertices);
    }

    private boolean contains(Integer verticle) {
        return vertices.contains(verticle);
    }

}
