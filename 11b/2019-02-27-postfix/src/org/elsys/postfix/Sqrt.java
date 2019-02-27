package org.elsys.postfix;

public class Sqrt extends BaseOperation implements Operation {

    public Sqrt(Calculator calculator) {
        super("sqrt", calculator);
    }

    @Override
    public void execute() {
        double value = getCalculator().pop();
        double result = Math.sqrt(value);
        getCalculator().push(result);
    }
}
