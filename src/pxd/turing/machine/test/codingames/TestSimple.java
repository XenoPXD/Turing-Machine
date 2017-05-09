package pxd.turing.machine.test.codingames;

import pxd.turing.machine.impl.TuringMachine;
import pxd.turing.machine.impl.TuringMachineFactory;
import pxd.turing.machine.impl.TuringMachineOutputFactory;

/**
 * Simulate test of Coding Games
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
public class TestSimple {

	public static void main(String[] args) {

		int S = 2; // number of symbols
		int T = 4; // tape length
		int X = 0; // the initial position of the head
		
		String START = "A"; // the initial state the machine is in.
		int N = 2; // number of states.
		
		String[] STATEACTIONS = {"A:1 R B;1 R HALT","B:1 L A;1 R B"}; 
		
		
		TuringMachine turingMachine = TuringMachineFactory.getCodinGames(S, T, X, START, N, STATEACTIONS);
		System.err.println(turingMachine.toString());
		
		turingMachine.simulate();
		
		System.out.println(TuringMachineOutputFactory.getCodinGames(turingMachine));
		
	}

}
