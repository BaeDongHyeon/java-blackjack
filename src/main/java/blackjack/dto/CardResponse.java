package blackjack.dto;

public class CardResponse {
    private String symbol;
    private String number;

    public CardResponse(String symbol, String number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getNumber() {
        return number;
    }
}
