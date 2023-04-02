package blackjack.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SymbolTest {

    @Test
    @DisplayName("올바른 문양이 아니면 에러가 발생한다.")
    void notSymbol() {
        assertThatThrownBy(() -> blackjack.domain.Symbol.of("abc"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("공백이 포함되면 에러가 발생한다.")
    void notSpaceSymbol() {
        assertThatThrownBy(() -> blackjack.domain.Symbol.of("스페 이드"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("올바른 문양을 입력하면 symbol이 반환된다.")
    void rightSymbol() {
        assertThat(blackjack.domain.Symbol.of("클로버"))
                .isEqualTo(blackjack.domain.Symbol.CLOVER);
    }
}
