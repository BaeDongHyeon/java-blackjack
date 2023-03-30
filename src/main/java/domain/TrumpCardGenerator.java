package domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TrumpCardGenerator {

    public List<Card> generate() {
        return Arrays.stream(Symbol.values())
                .flatMap(symbol -> Number.stream()
                        .map(number -> new Card(symbol, number)))
                .collect(Collectors.toList());
    }
}
