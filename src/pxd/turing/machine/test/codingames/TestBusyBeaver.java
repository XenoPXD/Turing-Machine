package pxd.turing.machine.test.codingames;

import pxd.turing.machine.impl.TuringMachine;
import pxd.turing.machine.impl.TuringMachineFactory;
import pxd.turing.machine.impl.TuringMachineOutputFactory;

/**
 * Simulate test of Coding Games
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
public class TestBusyBeaver {

	public static void main(String[] args) {

		int S = 2; // number of symbols
		int T = 10; // tape length
		int X = 3; // the initial position of the head
		
		String START = "S1"; // the initial state the machine is in.
		int N = 3; // number of states.
		
		String[] STATEACTIONS = {"S1:1 R S2;1 R HALT", "S2:0 R S3;1 R S2", "S3:1 L S3;1 L S1"}; 
		
		TuringMachine turingMachine = TuringMachineFactory.getCodinGames(S, T, X, START, N, STATEACTIONS);
		System.err.println(turingMachine.toString());
		
		turingMachine.simulate();
		
		System.out.println(TuringMachineOutputFactory.getCodinGames(turingMachine));
		
	}

}
