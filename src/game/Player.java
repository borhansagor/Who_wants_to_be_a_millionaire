package game;

public class Player extends main{
	
	String name;
	int bank;
	int fiftyFifty = 1;
	int doubleDip = 1;
	int skip = 1;
	/**
	 * @return the name
	 */
	public Player()
	{
		
	}
	public Player(String name) {
		this.bank = 0;
		this.fiftyFifty = 1;
		this.doubleDip = 1;
		this.skip = 1;
		setName(name);
	}
	
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the bank
	 */
	public int getBank() {
		return bank;
	}
	/**
	 * @param bank the bank to set
	 */
	public void setBank(int bank) {
		this.bank = bank;
	}
	/**
	 * @return the fiftyFifty
	 */
	public int getFiftyFifty() {
		return fiftyFifty;
	}
	/**
	 * @param fiftyFifty the fiftyFifty to set
	 */
	public void setFiftyFifty(int fiftyFifty) {
		this.fiftyFifty = fiftyFifty;
	}
	/**
	 * @return the doubleDip
	 */
	public int getDoubleDip() {
		return doubleDip;
	}
	/**
	 * @param doubleDip the doubleDip to set
	 */
	public void setDoubleDip(int doubleDip) {
		this.doubleDip = doubleDip;
	}
	/**
	 * @return the skip
	 */
	public int getSkip() {
		return skip;
	}
	/**
	 * @param skip the skip to set
	 */
	public void setSkip(int skip) {
		this.skip = skip;
	}
	@Override
	public String toString() {
		return "player [name=" + name + ", bank=" + bank + ", fiftyFifty=" + fiftyFifty + ", doubleDip=" + doubleDip
				+ ", skip=" + skip + "]";
	}
	public int lifeLineLeft()
	{
		int value=getDoubleDip()+getFiftyFifty()+getSkip();
		return value;
	}
	
	
}
