package org.elsys.postfix;

import java.util.Map;
import java.util.Stack;

public class Calculator {

    private Stack<Double> values;

    private Map<String, Operation> operations;


    public void execute(String token) {
        if (operations.containsKey(token)) {
            Operation operation = operations.get(token);
            operation.execute();
        } else {
            throw new RuntimeException(
                    String.format("Operation %s not found", token)
            );
        }
    }

    public void addOperation(Operation operation) {
        operations.put(operation.getName(), operation);
    }
}
