package org.elsys.gates;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AndGateTest {
    private Wire in1;
    private Wire in2;
    private Wire out;
    private Gate gate;

    @Before
    public void setup(){
        in1 = new Wire();
        in2 = new Wire();
        out = new Wire();

        gate = new AndGate(in1, in2, out);
    }

    @Test
    public void testIn1TrueIn2False(){
        in1.setState(true);
        in2.setState(false);

        assertFalse(out.getState());
    }

    @Test
    public void testIn1TrueIn2True(){
        in1.setState(true);
        in2.setState(true);

        assertTrue(out.getState());
    }
}
