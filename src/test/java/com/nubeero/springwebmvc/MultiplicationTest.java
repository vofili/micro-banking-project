package com.nubeero.springwebmvc;

import com.nubeero.springwebmvc.calculator.Multiplication;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTest {

    private final Multiplication multiply = new Multiplication();


    @Test
    public void shouldMatchSign(){
        assertTrue(multiply.handle('*'));
        assertFalse(multiply.handle('+'));
    }

    @Test
    public void shouldCorrectlyApplyOperation(){
        assertEquals(multiply.apply(4,3),12);
        assertEquals(multiply.apply(12,10),120);

    }
}
