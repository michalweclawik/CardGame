import java.util.HashMap;

public class CardUtilis {
    static HashMap<String,Integer> CardUtils = new HashMap<>();

    static {
        CardUtils.put("two",2);
        CardUtils.put("three",3);
        CardUtils.put("four",4);
        CardUtils.put("five",5);
        CardUtils.put("six",6);
        CardUtils.put("seven",7);
        CardUtils.put("eight",8);
        CardUtils.put("nine",9);
        CardUtils.put("ten",10);
        CardUtils.put("Jack",11);
        CardUtils.put("Queen",12);
        CardUtils.put("King",13);
        CardUtils.put("Ass",14);
    }
    final static String[] CardSuit = {
            "\u2665",
            "\u2663",
            "\u2666",
            "\u2660"};

}
