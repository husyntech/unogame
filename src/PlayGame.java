public class PlayGame {
    private GameCreator newGame;
    private Rules rules;
    private CardColour cardColour;
    private CardType cardType;
    public PlayGame(){
        newGame = new GameCreator();
        rules = new Rules(this);
        setColour();
        setType();
    }

    public void playCard() {
        setColour();
        setType();

    }

    private void setColour(){
        int size = newGame.getDiscard().size();
        Card last = newGame.getDeckCards().get(size-1);
        cardColour = last.getColour();

    }
    private void setType(){
        int size = newGame.getDiscard().size();
        Card last = newGame.getDeckCards().get(size-1);
        cardType = last.getType();
    }
}
