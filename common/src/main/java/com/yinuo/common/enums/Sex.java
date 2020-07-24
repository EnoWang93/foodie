package com.yinuo.common.enums;

public enum Sex {
    female(0, "female"),
    male(1, "male"),
    unknown(2, "unknown");

    public final Integer type;
    public final String value;

    Sex(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
