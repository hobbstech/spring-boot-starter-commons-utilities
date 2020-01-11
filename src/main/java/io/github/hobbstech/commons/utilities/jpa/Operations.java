package io.github.hobbstech.commons.utilities.jpa;

public enum Operations {

    GREATER_THAN(">"),
    LESS_THAN("<"),
    EQUALS(":");

    String sign;

    Operations(String sign) {
        this.sign = sign;
    }
}
