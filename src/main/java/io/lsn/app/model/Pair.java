package io.lsn.app.model;

public class Pair implements Comparable<Pair> {

    private final int first;
    private final int second;

    public Pair(int first, int second) {
        this.first = first < second ? first : second;
        this.second = first < second ? second : first;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return first + " " + second;
    }

    @Override
    public int compareTo(Pair o) {
        return first - o.first;
    }
}
