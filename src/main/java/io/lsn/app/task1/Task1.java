package io.lsn.app.task1;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        out.println("Task1!");
        ArrayList<Integer> input = new ArrayList<>();
        while (scanner.hasNextInt()) {
            input.add(scanner.nextInt());
        }
        var result = new Result(input);
        out.println(result);
    }
}
