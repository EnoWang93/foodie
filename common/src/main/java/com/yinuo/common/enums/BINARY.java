package com.yinuo.common.enums;

public enum BINARY {
    NO(0, "NO"),
    YES(1, "YES");

    public final Integer type;
    public final String value;

    BINARY(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
