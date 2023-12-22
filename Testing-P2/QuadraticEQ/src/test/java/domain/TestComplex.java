package domain;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestComplex {

    private Complex c;

    @Before
    public void setUp() throws Exception {
        c = new Complex(1, 1);
    }

    @Test
    public final void testToString() {
        assertEquals(c.toString(), String.format("%.4f+%.4fi", c.getReal(), c.getImaginary()));
        c.setImaginary(0);
        assertEquals(c.toString(), String.format("%.4f", c.getReal()));
        c.setImaginary(-1);
        assertEquals(c.toString(), String.format("%.4f%.4fi", c.getReal(), c.getImaginary()));

    }

}
