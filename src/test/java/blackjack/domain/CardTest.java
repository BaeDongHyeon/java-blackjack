package blackjack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CardTest {

    @Test
    @DisplayName("문양과 숫자가 있으면 카드가 생성 된다.")
    void createCard() {
        // given
        Symbol symbol = Symbol.CLOVER;
        Number number = Number.ACE;

        // when
        Card card = new Card(symbol, number);

        // then
        assertThat(card.getSymbol())
                .isEqualTo(Symbol.CLOVER);
        assertThat(card.getNumber())
                .isEqualTo(Number.ACE);
    }
}
