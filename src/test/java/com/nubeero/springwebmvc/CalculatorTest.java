package com.nubeero.springwebmvc;

import com.nubeero.springwebmvc.calculator.Calculator;
import com.nubeero.springwebmvc.calculator.Operation;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import java.util.Collections;

public class CalculatorTest {
    private Calculator calculator;
    private Operation mockOperation;

    @BeforeEach
    public void setUp(){
        mockOperation = Mockito.mock(Operation.class);
        calculator = new Calculator(Collections.singletonList(mockOperation));
    }

    public void shouldThrowwhenNoSuitableOperationFound(){

    }
}
