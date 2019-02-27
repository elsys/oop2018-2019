package org.elsys.postfix;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Calculator {

    private Stack<Double> values;
    private Map<String, Operation> operations;

    public Calculator() {
        values = new Stack<>();
        operations = new HashMap<>();
    }

    public void run(InputStream in, OutputStream out) {
        Scanner scanner = new Scanner(in);
        while (scanner.hasNext()) {

        }

    }

    public void push(double value) {
        values.push(value);
    }

    public void execute(String token) {
        Operation operation = operations.get("token");
        if (operation == null) {
            throw new RuntimeException(
                    String.format("Operation %s not found", token)
            );
        }
        operation.execute();
    }
}
