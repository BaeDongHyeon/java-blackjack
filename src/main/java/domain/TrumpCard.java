package domain;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class TrumpCard {

    private final Deque<Card> cards;

    public TrumpCard(List<Card> cards) {
        Collections.shuffle(cards);
        this.cards = new ArrayDeque<>(cards);
    }

}
