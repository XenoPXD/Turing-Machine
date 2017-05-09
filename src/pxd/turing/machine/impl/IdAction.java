package pxd.turing.machine.impl;

/**
 * Identifier Action.
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
public class IdAction {

	private Symbol symbol;
	private State state;
	
	public IdAction() {
	}
	
	/**
	 * Constructor with state and symbol.
	 * @param state state
	 * @param symbol symbol
	 */
	public IdAction(State state, Symbol symbol) {
		super();
		this.symbol = symbol;
		this.state = state;
	}
	
	/**
	 * Constructor with state and symbol.
	 * @param state state
	 * @param symbol symbol
	 */
	public IdAction(String state, String symbol) {
		super();
		this.symbol = new Symbol("", symbol);
		this.state = new State(state);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return this.state.getValue().concat("#").concat(this.symbol.getValue());
	}
	
	/**
	 * Gets symbol of the IdAction
	 * @return symbol of the IdAction
	 */
	public Symbol getSymbol() {
		return symbol;
	}
	
	/**
	 * Sets symbol of the IdAction
	 * @param symbol symbol of the IdAction
	 */
	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}
	
	/**
	 * Gets state of the IdAction
	 * @return state of the IdAction
	 */
	public State getState() {
		return state;
	}
	
	/**
	 * Sets state of the IdAction
	 * @param state state of the IdAction
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	
	
}
