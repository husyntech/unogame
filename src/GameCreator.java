import java.util.ArrayList;
import java.util.List;

public class GameCreator {
    private Deck deck;
    private ListOfPlayers listOfPlayers;
    private Discard discard;
    private List<Player> gamePlayers;

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

    public List<Card> getPlayerCards(int x){
        return gamePlayers.get(x).getPlayerHand();
    }
    public List<Card> getDeckCards(){
        return deck.getUnoDeck();
    }
    public List<Card> getDiscard(){
        return discard.getDiscardPile();
    }
    public void addCardToDiscard(Card card){
        discard.addToDiscardPile(card);
    }
    public void addCardToPlayerHand(int position, Card card){
        gamePlayers.get(position).addCardToHand(card);
    }
    public void addCardToDeck(Card card){
        deck.addCard(card);
    }
}
