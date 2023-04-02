package blackjack.domain;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import org.junit.jupiter.api.Test;

class TrumpCardGeneratorTest {

    @Test
    void name() {
        // given
        TrumpCardGenerator trumpCardGenerator = new TrumpCardGenerator();
        List<Card> cards = trumpCardGenerator.generate().stream()
                .distinct()
                .collect(toList());

        // expect
        assertThat(cards)
                .hasSize(52);
    }
}
