package blackjack.domain;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class TrumpCard {

    private final Deque<Card> cards;

    public TrumpCard(List<Card> cards) {
        this.cards = new ArrayDeque<>(cards);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            throw new IllegalArgumentException("[ERROR] 뽑을 카드가 없습니다.");
        }
        return cards.pop();
    }
}
