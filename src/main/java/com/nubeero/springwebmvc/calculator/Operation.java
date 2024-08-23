package com.nubeero.springwebmvc.calculator;

public interface Operation {


    boolean handle(char op);

    int apply(int lhs, int rhs);
}
