package com.nubeero.springwebmvc.calculator;

import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Component
public class Calculator {

    private final Collection<Operation> operations;

    public Calculator(Collection<Operation> operations){
        this.operations = operations;
    }


    public void calculate(int lhs,int rhs,char op){
            operations.stream()
                    .filter(operation -> operation.handle(op))
                    .map(operation -> operation.apply(lhs,rhs))
                    .peek(result -> System.out.printf("%d %s %d = %d%n",lhs,op,rhs,result))
                    .findFirst()
                    .orElseThrow(()-> new IllegalArgumentException("Operation not found"));

    }
}
