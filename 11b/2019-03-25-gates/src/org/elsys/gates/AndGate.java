package org.elsys.gates;

public class AndGate extends BinaryGate {


    public AndGate(Wire in1, Wire in2, Wire out) {
        super(in1, in2, out);
    }

    @Override
    public void act() {
        getOut().setState(
                getInput1().getState()
                && getInput2().getState()
        );
    }
}
