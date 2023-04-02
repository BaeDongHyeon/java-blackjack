package blackjack.domain;

import static java.util.stream.Collectors.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TrumpCardGenerator {

    public List<Card> generate() {
        return Arrays.stream(Symbol.values())
                .flatMap(symbol -> Number.stream()
                        .map(number -> new Card(symbol, number)))
                .collect(collectingAndThen(toList(), this::shuffle));
    }

    private List<Card> shuffle(List<Card> cards) {
        Collections.shuffle(cards);
        return cards;
    }
}
