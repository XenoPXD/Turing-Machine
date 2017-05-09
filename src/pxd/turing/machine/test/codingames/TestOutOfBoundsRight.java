package pxd.turing.machine.test.codingames;

import pxd.turing.machine.impl.TuringMachine;
import pxd.turing.machine.impl.TuringMachineFactory;
import pxd.turing.machine.impl.TuringMachineOutputFactory;

/**
 * Simulate test of Coding Games
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
public class TestOutOfBoundsRight {

	public static void main(String[] args) {
		
		int S = 3; // number of symbols
		int T = 20; // tape length
		int X = 0; // the initial position of the head
		
		String START = "b"; // the initial state the machine is in.
		int N = 4; // number of states.
		
		String[] STATEACTIONS = {"b:1 R c;0 R b;0 R b", "c:0 R e;0 R c;0 R c", "e:2 R f;0 R e;0 R e", "f:0 R b;0 R f;0 R f"}; 
		
		TuringMachine turingMachine = TuringMachineFactory.getCodinGames(S, T, X, START, N, STATEACTIONS);
		System.err.println(turingMachine.toString());
		
		turingMachine.simulate();
		
		System.out.println(TuringMachineOutputFactory.getCodinGames(turingMachine));

	}

}
