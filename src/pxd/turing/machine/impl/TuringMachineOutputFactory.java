package pxd.turing.machine.impl;

/**
 * Turing machine output factory.
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
public class TuringMachineOutputFactory {

	/**
	 * Return output for Coding Games
	 * @param turingMachine A Turing Machine
	 * @return string
	 */
	public static String getCodinGames(TuringMachine turingMachine) {
		String v = "";
		String nbAction = String.valueOf(turingMachine.getNumberAction());
		String pos = String.valueOf(turingMachine.getHead().getPosition());
		v+=nbAction+"\n"+pos+"\n"+turingMachine.getTape().listCellsToString();
		return v;
	}
	
}
