package domain;

import java.util.Arrays;
import java.util.Objects;

public enum Symbol {
    SPADE("스페이드"),
    DIAMOND("다이아몬드"),
    HEART("하트"),
    CLOVER("클로버");

    private final String name;

    Symbol(String name) {
        this.name = name;
    }

    public static Symbol of(String name) {
        return Arrays.stream(values())
                .filter(symbol -> Objects.equals(symbol.name, name))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 올바른 트럼프 문양이 아닙니다."));
    }

    public String getName() {
        return name;
    }
}
