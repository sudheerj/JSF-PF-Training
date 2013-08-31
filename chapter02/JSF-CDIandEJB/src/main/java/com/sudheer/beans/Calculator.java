package com.sudheer.beans;

import javax.ejb.Stateless;

@Stateless
public class Calculator {

    public double add(double x, double y) {
        return x + y;
    }

}
