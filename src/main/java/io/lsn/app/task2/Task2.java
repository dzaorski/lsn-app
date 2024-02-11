package io.lsn.app.task2;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Task2!");
        ArrayList<Integer> input = new ArrayList<>();
        while (scanner.hasNextInt()) {
            input.add(scanner.nextInt());
        }
        var output = new Result(input);
        out.println(output);
    }

}
