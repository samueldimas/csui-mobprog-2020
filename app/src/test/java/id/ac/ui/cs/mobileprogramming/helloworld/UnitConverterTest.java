package id.ac.ui.cs.mobileprogramming.helloworld;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitConverterTest {
    @Test
    public void convertKilogramToGram() throws Exception {
        int input = 1;
        int expected = 1000;
        int output;

        UnitConverter unitConverter = new UnitConverter();
        output = unitConverter.convertKilogramToGram(input);

        assertEquals(expected, output);
    }
}
