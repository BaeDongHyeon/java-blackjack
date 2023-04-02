package blackjack.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static blackjack.domain.Number.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NumberTest {

    @Test
    @DisplayName("올바른 숫자가 아니면 에러가 발생한다.")
    void notNumber() {
        assertThatThrownBy(() -> of("b"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("공백이 포함되면 에러가 발생한다.")
    void notSpaceNumber() {
        assertThatThrownBy(() -> of(" 5"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("올바른 숫자를 입력하면 Number가 반환된다.")
    void rightNumber() {
        assertThat(of("A"))
                .isEqualTo(ACE);
    }
}
