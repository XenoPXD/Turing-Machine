package pxd.turing.machine.impl;

/**
 * Action that tells the machine what symbol to write on the tape, how to move the playhead
 * (eg "G" for a box to the left, "D" for a box to the right), and what is the new state.
 * @author Xavier PRUNCK
 * @version 1.1, 24/04/2017
 */
public class Action {

	/**
	 * Identifier action.
	 */
	private IdAction id;
	
	/**
	 * Symbol to write.
	 */
	private Symbol writeSymbol;
	
	/**
	 * Move the head.
	 */
	private String MoveTheHead;
	
	/**
	 * New state, go to state.
	 */
	private State goToState;
	
	/**
	 * Default Constructor
	 */
	public Action() {
	}
	
	/**
	 * Constructor with idAction.
	 * @param idAction identifier of action
	 */
	public Action(final IdAction idAction) {
		this.id = idAction;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String v = writeSymbol.getValue() + " " + MoveTheHead + " " + goToState.getValue();
		return v;
	}
	
	/**
	 * Gets idAction.
	 * @return idAction identifier of action
	 */
	public IdAction getId() {
		return id;
	}
	
	/**
	 * Sets the idAction
	 * @param id identifier of action
	 */
	public void setId(IdAction id) {
		this.id = id;
	}
	
	/**
	 * Gets Symbol to write.
	 * @return symbol to write.
	 */
	public Symbol getWriteSymbol() {
		return writeSymbol;
	}
	
	/**
	 * Sets Symbol to write.
	 * @param writeSymbol symbol to write
	 */
	public void setWriteSymbol(Symbol writeSymbol) {
		this.writeSymbol = writeSymbol;
	}
	
	/**
	 * Gets Move the head.
	 * @return move the head
	 */
	public String getMoveTheHead() {
		return MoveTheHead;
	}
	
	/**
	 * Sets Move the head.
	 * @param moveTheHead move the head
	 */
	public void setMoveTheHead(String moveTheHead) {
		MoveTheHead = moveTheHead;
	}
	
	/**
	 * Gets New state, go to state.
	 * @return new state, go to state
	 */
	public State getGoToState() {
		return goToState;
	}
	
	/**
	 * Sets New state, go to state.
	 * @param goToState new state, go to state
	 */
	public void setGoToState(State goToState) {
		this.goToState = goToState;
	}
	
	
}
