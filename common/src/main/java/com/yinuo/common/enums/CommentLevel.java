package com.yinuo.common.enums;

public enum CommentLevel {
    GOOD(1, "good"),
    NORMAL(2, "ok"),
    BAD(3, "bad");

    public final Integer type;
    public final String value;

    CommentLevel(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
