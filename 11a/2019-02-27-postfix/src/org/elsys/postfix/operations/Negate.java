package org.elsys.postfix.operations;

import org.elsys.postfix.AbstractOperation;
import org.elsys.postfix.Calculator;
import org.elsys.postfix.Operation;

public class Negate extends AbstractOperation implements Operation {

    public Negate(Calculator calculator) {
        super(calculator, "neg");
    }

    @Override
    public void execute() {
        double value = getCalculator().pop();
        getCalculator().push(-value);
    }
}
