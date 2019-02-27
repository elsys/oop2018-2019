package org.elsys.postfix;

public abstract class AbstractOperation implements Operation {

    private Calculator calculator;

    private String name;

    public AbstractOperation(Calculator calculator, String name) {
        this.calculator = calculator;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    protected Calculator getCalculator() {
        return calculator;
    }
}
