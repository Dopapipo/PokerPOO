package classes;

import java.util.ArrayList;

public class AllInPot extends Pot {
	private Player player;
	private int allInBet;
	
	public AllInPot(int allInBet, Player player) {
		super();
		this.setPlayer(player);
		this.setAllInBet(allInBet);
	}
	public AllInPot(ArrayList<Player> players) {
		super(players);
		this.allInBet=players.get(0).getBet();
	}
	public int getAllInBet() {
		return allInBet;
	}

	public void setAllInBet(int allInBet) {
		this.allInBet = allInBet;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
}
