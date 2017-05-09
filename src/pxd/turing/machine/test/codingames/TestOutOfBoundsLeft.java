package pxd.turing.machine.test.codingames;

import pxd.turing.machine.impl.TuringMachine;
import pxd.turing.machine.impl.TuringMachineFactory;
import pxd.turing.machine.impl.TuringMachineOutputFactory;

/**
 * Simulate test of Coding Games
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
public class TestOutOfBoundsLeft {

	public static void main(String[] args) {
		
		int S = 4; // number of symbols
		int T = 30; // tape length
		int X = 25; // the initial position of the head
		
		String START = "Turing"; // the initial state the machine is in.
		int N = 5; // number of states.
		
		String[] STATEACTIONS = {"Turing:1 L was;1 L was;0 L a;0 L a", "was:2 R a;2 L a;2 L a;2 R a", "a:2 R smart;3 L Turing;3 R Turing;3 R Turing", "smart:0 L guy;1 L guy;2 L guy;3 L guy", "guy:3 R Turing;2 R Turing;1 R Turing;0 R Turing"}; 
		
		TuringMachine turingMachine = TuringMachineFactory.getCodinGames(S, T, X, START, N, STATEACTIONS);
		System.err.println(turingMachine.toString());
		
		turingMachine.simulate();
		
		System.out.println(TuringMachineOutputFactory.getCodinGames(turingMachine));

	}

}
