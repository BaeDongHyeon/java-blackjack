package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static domain.Symbol.*;
import static org.assertj.core.api.Assertions.*;

public class SymbolTest {

    @Test
    @DisplayName("올바른 문양이 아니면 에러가 발생한다.")
    void notSymbol() {
        assertThatThrownBy(() -> of("abc"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("올바른 문양을 입력하면 symbol이 반환된다.")
    void rightSymbol() {
        assertThat(of("클로버"))
                .isEqualTo(CLOVER);
    }
}
