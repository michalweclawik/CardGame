import java.util.*;


public class CardGame {

    private final ArrayList<Card> deckOfCards = new ArrayList<>();

    public CardGame() {

        try {
        for (String suit : CardUtilis.CardSuit) {
            for (String i : CardUtilis.CardUtils.keySet()) {
            Card card = new Card(suit, i, CardUtilis.CardUtils.get(i));
            deckOfCards.add(card);
            }

        }} catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Card> getDeck() {
        return deckOfCards;
    }

//    public Card2 dealCard(){
//        return deckOfCards.get(deckOfCards.size()-1);
//    }

    public Card dealCard(){

        return deckOfCards.remove(0);
    }

    public List<Card> sortDeckInNumberOrder() {
        deckOfCards.sort( ( a, b ) -> a.getValue() - b.getValue() );
        return deckOfCards;
    }
    public List<Card> sortDeckIntoSuits() {
        deckOfCards.sort( ( a, b ) -> a.getSuit().compareTo( b.getSuit() ) );
        return deckOfCards;
    }
    public void shuffleDeck(){
       Collections.shuffle(deckOfCards);
    }
}
