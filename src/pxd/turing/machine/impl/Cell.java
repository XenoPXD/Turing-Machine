package pxd.turing.machine.impl;

/**
 * The cells constituting the Tape, each cell contains a symbol from some finite alphabet.
 * Initially all tape cells are marked with <b>0</b>.
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
public class Cell {

	private Symbol symbol;

	public Cell () {
	}
	
	/**
	 * Constructor with symbol.
	 * @param symbol symbol in the cell
	 */
	public Cell (final Symbol symbol) {
		this.symbol = symbol;
	}
	
	/**
	 * Gets symbol in the cell
	 * @return symbol
	 */
	public Symbol getSymbol() {
		return symbol;
	}

	/**
	 * Sets symbol in the cell
	 * @param symbol symbol in the cell
	 */
	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}
	
	
	
}
