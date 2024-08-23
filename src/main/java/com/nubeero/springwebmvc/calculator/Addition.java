package com.nubeero.springwebmvc.calculator;

import org.springframework.stereotype.Component;

@Component
public class Addition implements Operation{

    @Override
    public boolean handle(char op){
        return op == '+';
    }

    @Override
    public int apply(int lhs, int rhs){
        return lhs + rhs;
    }
}
