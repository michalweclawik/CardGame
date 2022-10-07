import java.util.*;


public class CardGame {

    private final ArrayList<Card2> deckOfCards = new ArrayList<>();

    public CardGame() {

        try {
        for (String suit : CardUtilis.CardSuit) {
            for (String i : CardUtilis.CardUtils.keySet()) {
            Card2 card = new Card2(suit, i, CardUtilis.CardUtils.get(i));
            deckOfCards.add(card);
            }

        }} catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public ArrayList<Card2> getDeck() {
        return deckOfCards;
    }

//    public Card2 dealCard(){
//        return deckOfCards.get(deckOfCards.size()-1);
//    }

    public Card2 dealCard(){

        return deckOfCards.remove(0);
    }

    public List<Card2> sortDeckInNumberOrder() {
        deckOfCards.sort( ( a, b ) -> a.getValue() - b.getValue() );
        return deckOfCards;
    }
    public List<Card2> sortDeckIntoSuits() {
        deckOfCards.sort( ( a, b ) -> a.getSuit().compareTo( b.getSuit() ) );
        return deckOfCards;
    }
    public void shuffleDeck(){
       Collections.shuffle(deckOfCards);
    }
}
