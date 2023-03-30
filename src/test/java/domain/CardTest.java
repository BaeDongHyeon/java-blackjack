package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CardTest {

    private static final String CARD_NAME = "클로버A";

    @Test
    @DisplayName("문양과 숫자가 있으면 카드가 생성 된다.")
    void createCard() {
        // given
        Symbol symbol = Symbol.CLOVER;
        Number number = Number.ACE;

        // when
        Card card = new Card(symbol, number);

        // then
        assertThat(card.getCardName()).isEqualTo(CARD_NAME);
    }
}
