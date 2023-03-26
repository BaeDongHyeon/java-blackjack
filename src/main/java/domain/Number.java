package domain;

import java.util.Arrays;
import java.util.Objects;

public enum Number {
    ACE("A"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K");

    private final String name;

    Number(String name) {
        this.name = name;
    }

    public static Number of(String name) {
        return Arrays.stream(values())
                .filter(number -> Objects.equals(number.name, name))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] 올바른 트럼프 숫자가 아닙니다."));
    }
}
