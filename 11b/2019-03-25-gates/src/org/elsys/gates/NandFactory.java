package org.elsys.gates;

public abstract class NandFactory {
    public static Gate makeNotGate(Wire in, Wire out) {
	    NandGate gate = new NandGate(in, in, out);
	    return gate;
    }

    public static Gate makeOrGate(Wire in1, Wire in2, Wire out) {
        return new NandGate(in1, in2, out);
    }

    public static Gate makeAndGate(Wire in1, Wire in2, Wire out) {
        return new NandGate(in1, in2, out);
    }

    public static Gate makeXorGate(Wire in1, Wire in2, Wire out) {
        return new NandGate(in1, in2, out);
    }
}
