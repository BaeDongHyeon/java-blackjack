package domain;

import java.util.Collections;
import java.util.List;

public class TrumpCard {

    private final List<Card> cards;

    public TrumpCard(List<Card> cards) {
        this.cards = cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }


}
