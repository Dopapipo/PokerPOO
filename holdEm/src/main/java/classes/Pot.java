package classes;

import java.util.ArrayList;
/**
 * A Pot is used to distribute gains at the end of a round,
 * and holds all the bets. There can be multiple pots when a player goes all-in,
 * because the remaining players will compete for a pot that the all-in player
 * can not win, as he has not paid into it.
 * A pot has a thresholdBet that a player needs to pay in order to compete for it.
 */
public class Pot implements Comparable<Pot> {
	private int value;
	private int thresholdBet;
	private ArrayList<Player> players;
	public Pot() {
		this.value=0;
		this.players= new ArrayList<>();
	}
	public Pot(ArrayList<Player> players) {
		this.players=players;
	}
	public void addPlayer(Player player) {
		this.players.add(player);
	}
	public void addBet(int bet) {
		this.value+=bet;
	}
	public void resetPot() {
		this.value=0;
		this.players.clear();
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public ArrayList<Player> getPlayers() {
		return players;
	}
	@SuppressWarnings("unchecked")
	public void setPlayers(ArrayList<Player> players) {
		//clone player list to avoid list side effects ("effets de bord")
		this.players = (ArrayList<Player>) players.clone();
	}
	public int getThresholdBet() {
		return thresholdBet;
	}
	public void setThresholdBet(int thresholdBet) {
		this.thresholdBet = thresholdBet;
	}
	@Override
	/**
	 * Compares pots based on their values
	 * @param o : other pot
	 * @return positive integer if this pot has higher value than the other, 0
	 * if this pot has the same value as the other, and negative integer if this pot
	 * has a lower value than the other pot
	 */
	public int compareTo(Pot o) {
		// TODO Auto-generated method stub
		return this.getValue()-o.getValue();
	}
	public String toString() {
		return "this pot holds a value of " + this.value + "and has a threshold bet of " + this.thresholdBet;
	}
}
