import java.util.Objects;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Snap extends CardGame {
    static Scanner userInput = new Scanner(System.in);
    Timer timer = new Timer();
    public void runGame() {


        shuffleDeck();
        String previousSymbol = null;
        String currentSymbol = null;
        boolean hasToRun = true;

        while (hasToRun) {


            System.out.println( "Player " + Player.player  + " please press enter");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            Card2 currentCard = dealCard();
            currentSymbol = currentCard.getSymbol();

            System.out.println(currentCard);

            Player.switchPlayer();

        if (Objects.equals(previousSymbol, currentSymbol)) {

            System.out.println("Player: " + Player.player  + " type SNAP to win ");

            TimerTask snap = new TimerTask() {
                public void run() {
//
                    System.exit(0);

                }
            };

            timer.schedule( snap, 2*1000 );

            if((scanner.nextLine().equals("snap"))){

                System.out.println("Game finish player: " + Player.player  + " won!!!!! ");
            } else {

                System.out.println("Game finish player: " + Player.player  + " lost!!! ");
                    Player.switchPlayer();
                System.out.println("Game finish player: " + Player.player  + " won!!!!! ");}
             hasToRun = false;
        }


        previousSymbol = currentSymbol;
        currentSymbol=null;
    }timer.cancel();}


}
