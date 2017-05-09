package pxd.turing.machine.test.codingames;

import pxd.turing.machine.impl.TuringMachine;
import pxd.turing.machine.impl.TuringMachineFactory;
import pxd.turing.machine.impl.TuringMachineOutputFactory;

/**
 * Simulate test of Coding Games
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
public class TestBusyBeaverEtCopy {

	public static void main(String[] args) {
		
		int S = 2; // number of symbols
		int T = 20; // tape length
		int X = 3; // the initial position of the head
		
		String START = "bb1"; // the initial state the machine is in.
		int N = 9; // number of states.
		
		String[] STATEACTIONS = {"bb1:1 R bb2;1 L bb4", "bb2:0 R bb3;1 R bb2", "bb3:1 L bb3;1 L bb1", "bb4:1 R bb1;1 L copy1", "copy1:0 R HALT;0 R copy2", "copy2:0 R copy3;1 R copy2", "copy3:1 L copy4;1 R copy3", "copy4:0 L copy5;1 L copy4", "copy5:1 R copy1;1 L copy5"}; 
		
		TuringMachine turingMachine = TuringMachineFactory.getCodinGames(S, T, X, START, N, STATEACTIONS);
		System.err.println(turingMachine.toString());
		
		turingMachine.simulate();
		
		System.out.println(TuringMachineOutputFactory.getCodinGames(turingMachine));

	}

}
