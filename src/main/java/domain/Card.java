package domain;

public class Card {

    private final Symbol symbol;
    private final Number number;

    public Card(String symbol, String number) {
        this.symbol = Symbol.of(symbol);
        this.number = Number.of(number);
    }
}
