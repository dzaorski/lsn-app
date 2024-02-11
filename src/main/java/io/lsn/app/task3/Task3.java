package io.lsn.app.task3;

import io.lsn.app.model.Pair;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Task 3!");
        ArrayList<Pair> input = new ArrayList<>();
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            input.add(new Pair(scanner.nextInt(), scanner.nextInt()));
        }
        var output = new Result(input);
        out.println(output);
    }
}
