package pxd.turing.machine.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * A tape divided into cells, one next to the other. Each cell contains a symbol
 * from some finite alphabet. The alphabet contains a special blank symbol (here
 * written as '0') and one or more other symbols. The tape is assumed to be
 * arbitrarily extendable to the left and to the right, i.e., the Turing machine
 * is always supplied with as much tape as it needs for its computation. Cells
 * that have not been written before are assumed to be filled with the blank
 * symbol. In some models the tape has a left end marked with a special symbol;
 * the tape extends or is indefinitely extensible to the right.
 * Initially all tape cells are marked with <b>0</b>.
 * 
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
public class Tape {

	private List<Cell> listCells = new ArrayList<Cell>();

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String v = "Tape :\nnb cells : "+ listCells.size() + "\nlistCells : ";
		
		for (Cell cell : listCells) {
			v+=cell.getSymbol().getValue();
		}
		return v+"\n";
	}
	
	
	/**
	 * Return string of list cells
	 * @return string
	 */
	public String listCellsToString() {
		String v = "";
		
		for (Cell cell : listCells) {
			v+=cell.getSymbol().getValue();
		}
		return v;
	}
	
	/**
	 * Gets list Cells
	 * @return symbol
	 */
	public List<Cell> getListCells() {
		return listCells;
	}

	/**
	 * Sets list Cells
	 * @param listCells list Cells
	 */
	public void setListCells(List<Cell> listCells) {
		this.listCells = listCells;
	}
	
	
	
}
