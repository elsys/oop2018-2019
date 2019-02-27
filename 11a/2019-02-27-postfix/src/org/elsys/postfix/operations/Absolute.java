package org.elsys.postfix.operations;

import org.elsys.postfix.AbstractOperation;
import org.elsys.postfix.Calculator;
import org.elsys.postfix.Operation;

public class Absolute extends AbstractOperation implements Operation {

    public Absolute(Calculator calculator) {
        super(calculator, "abs");
    }

    @Override
    public void execute() {
        double value = getCalculator().pop();
        getCalculator().push(value < 0 ? -value : value);
    }
}
