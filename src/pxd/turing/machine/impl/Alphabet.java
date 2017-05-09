package pxd.turing.machine.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * The Alphabet is the list of symbols, it contains a special blank symbol (here written as '0') and one or more other symbols.
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
public class Alphabet {
	
	List<Symbol> listSymbols = new ArrayList<Symbol>();

	/**
	 * Gets the number of symbols.
	 * @return the number of symbols
	 */
	public int getNbSymbols() {
		return listSymbols.size();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String v = "Alphabet :\nnb symbols : "+ getNbSymbols() + "\n";
		
		for (Symbol symbol : listSymbols) {
			v+="symbol : " + symbol.getValue() + " | " + symbol.getName()+"\n";
		}
		return v;
	}
	
	/**
	 * Gets list of symbols.
	 * @return list of symbols
	 */
	public List<Symbol> getListSymbols() {
		return listSymbols;
	}

	/**
	 * Sets list of symbols.
	 * @param listSymbols list of symbols
	 */
	public void setListSymbols(List<Symbol> listSymbols) {
		this.listSymbols = listSymbols;
	}

	
}
