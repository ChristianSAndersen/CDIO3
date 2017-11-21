package juniorMatador;

public class Player {
    private String name;
    private boolean playerTurn = false;
    private int playerNumber;
    Money money;
    Buildings buildings;

    Player(String name, int playerNumber) {
        this.name = name;
        this.playerNumber = playerNumber;
        money = new Money();
        buildings = new Buildings();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerTurn (boolean playerTurn) {
        this.playerTurn = playerTurn;
    }

    public boolean getPlayerTurn () {
        return this.playerTurn;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}