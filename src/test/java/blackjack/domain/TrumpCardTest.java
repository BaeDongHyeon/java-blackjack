package blackjack.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class TrumpCardTest {

    @Test
    void name() {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Symbol.CLOVER, Number.SEVEN));
        cards.add(new Card(Symbol.DIAMOND, Number.SEVEN));
        cards.add(new Card(Symbol.SPADE, Number.SEVEN));
        cards.add(new Card(Symbol.DIAMOND, Number.TWO));
        TrumpCard trumpCard = new TrumpCard(cards);

        assertThat(trumpCard.drawCard())
                .isEqualTo(new Card(Symbol.CLOVER, Number.SEVEN));
    }
}
