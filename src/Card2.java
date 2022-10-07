

public class Card2 {

    private final String suit;

    private final String symbol;

    private final int value;


    public Card2 (String suit, String symbol, int value ) {

        this.suit = suit;
        this.symbol = symbol;
        this.value = value;

    }
    public String getSuit() {
        return suit;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "suit=" + suit +
                " symbol=" + symbol +
                " value=" + value + "\n";

    }

}
