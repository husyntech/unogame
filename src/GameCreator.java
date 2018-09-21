import java.util.ArrayList;
import java.util.List;

public class GameCreator {
    Deck deck;
    ListOfPlayers listOfPlayers;
    Discard discard;
    List<Player> gamePlayers;

    public GameCreator() {
        deck = new Deck();
        listOfPlayers = new ListOfPlayers();
        discard = new Discard();
        gamePlayers = new ArrayList<>();
    }

    public void addPlayer(int x){
        for(int i=0; i<x; i++){
            gamePlayers.add(listOfPlayers.removePlayer());
        }
    }

    public void giveCardsToPlayer() {
        for (int i = 0; i < gamePlayers.size(); i++) {
            for (int k=0; k<7; k++) {
                gamePlayers.get(i).getPlayerHand().add(deck.removeTopCard());
            k=k;
            }
        }
    }

    public List<Player> getGamePlayers() {
        return gamePlayers;
    }
}
