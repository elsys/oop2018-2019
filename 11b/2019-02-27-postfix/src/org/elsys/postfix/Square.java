package org.elsys.postfix;

public class Square extends BaseOperation implements Operation {
    public Square(Calculator calculator) {
        super("^2", calculator);
    }

    @Override
    public void execute() {
        double value = getCalculator().pop();
        double result = Math.pow(value, 2);
        getCalculator().push(result);
    }
}
