package pxd.turing.machine.impl;

/**
 * Turing machine factory.
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
public class TuringMachineFactory {

	
	/**
	 * Turing machine factory for Coding Games
	 * @param S symbols, space separated integers
	 * @param T number of symbols
	 * @param X tape length
	 * @param START the initial state the machine is in
	 * @param N number of states
	 * @param STATEACTIONS the name of the state and S actions separated by semicolon. An action has the format W M NEXT - symbol to write, direction to move, and state to go to
	 * @return TuringMachine
	 */
	public static TuringMachine getCodinGames(int S, int T, int X, String START, int N, String[] STATEACTIONS) {
		
		// -- Turing
		TuringMachine turingMachine = new TuringMachine();
		
		// Head
		Head head = new Head(X);
		head.setMoveLeft("L");
		head.setMoveRight("R");
		head.setWrite("write");
		head.setRead("read");
		
		// Alphabet & Symbol
		Alphabet alphabet = new Alphabet();
		
		Symbol symbolBlank = new Symbol(Symbol.BLANK, "0");
		alphabet.getListSymbols().add(symbolBlank);
		for (int i = 1; i < S; i++) {
			Symbol symbol = new Symbol();
			symbol.setValue(String.valueOf(i));
			symbol.setName("");
			alphabet.getListSymbols().add(symbol);
		}
		
		// Tape, cells
		Tape tape = new Tape();
		for (int i = 0; i < T; i++) {
			Cell cell = new Cell(symbolBlank);
			tape.getListCells().add(cell);
		}
		
		// Instructions, State
		StateRegister stateRegister = new StateRegister();
		Instructions instructions = new Instructions();
		State startState = new State(START);
		State endState = new State("HALT");

		stateRegister.setStartState(startState);
		stateRegister.setStateOfTheTuringMachine(startState);
		stateRegister.setEndState(endState);
		
		for (int i = 0; i < N; i++) {
			String[] s = STATEACTIONS[i].split(":");
			State state = new State(s[0]);
			stateRegister.getListStates().add(state);
			String[] actions = s[1].split(";");
			for (int a = 0; a < actions.length; a++) {
				String[] aa = actions[a].split(" ");
				Symbol symbol = new Symbol("", Integer.toString(a));
				Symbol writeSymbol = new Symbol("", aa[0]);
				String moveTheHead = aa[1];
				State goToState = new State(aa[2]);
				IdAction idAction = new IdAction(state,  symbol);
				Action action = new Action(idAction);
				action.setWriteSymbol(writeSymbol);
				action.setMoveTheHead(moveTheHead);
				action.setGoToState(goToState);
				instructions.getActions().put(idAction.toString(), action);
			}
		}
		
		turingMachine.setHead(head);
		turingMachine.setAlphabet(alphabet);
		turingMachine.setTape(tape);
		turingMachine.setInstructions(instructions);
		turingMachine.setStateRegister(stateRegister);
		
		return turingMachine;
	}
	
}
