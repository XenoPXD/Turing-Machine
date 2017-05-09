package pxd.turing.machine.impl;

/**
 * A Turing machine is a general example of a CPU that controls all data
 * manipulation done by a computer, with the canonical machine using sequential
 * memory to store data. More specifically, it is a machine (automaton) capable
 * of enumerating some arbitrary subset of valid strings of an alphabet; these
 * strings are part of a recursively enumerable set.
 * 
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
public class TuringMachine {

	private Head head;
	private Alphabet alphabet;
	private Tape tape;
	private Instructions instructions;
	private StateRegister stateRegister;
	private int numberAction = 0;
	
	/**
	 * Simulate a Turing machine.
	 */
	public void simulate() {
		
		State startState = this.stateRegister.getStartState();
		int startPosition = this.head.getPosition();
		Symbol startSymbol = this.tape.getListCells().get(startPosition).getSymbol();
		IdAction startIdAction = new IdAction(startState, startSymbol);
		Action action = this.instructions.getActions().get(startIdAction.toString());
		System.err.println(tape.toString());
		System.err.println(action.getId().toString() + "=" + action.toString());
		exec(action);
		
		 do {
			
			System.err.println(tape.toString());
			
			State state = this.stateRegister.getStateOfTheTuringMachine();
			System.err.println("state="+state.getValue());
			int position = this.head.getPosition();
			Symbol symbol = this.tape.getListCells().get(position).getSymbol();
			IdAction idAction = new IdAction(state, symbol);
			action = this.instructions.getActions().get(idAction.toString());
			
			exec(action);
			
		} while (!isEnd(action));
		
	}
	
	/**
	 * Checks whether the machine has to stop
	 * @param action current action
	 * @return boolean is end
	 */
	public boolean isEnd(Action action) {
		boolean end = false;
		if (action == null
				|| (action != null && action.getGoToState().getValue().equals(this.stateRegister.getEndState().getValue()))
				|| this.head.getPosition() > this.tape.getListCells().size() -1
				|| this.head.getPosition() < 0) {
			end = true;
		}
		return end;
	}
	
	
	/**
	 * Performs an action
	 * @param action action to execute
	 */
	public void exec(final Action action) {
		
		// write symbol
		this.head.write(tape, action.getWriteSymbol());
		
		// Move
		this.head.move(action.getMoveTheHead());
		
		// State
		this.stateRegister.setStateOfTheTuringMachine(action.getGoToState());
		
		// Compteur
		numberAction++;
		
		
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String v = this.getHead().toString();
		v+= this.getAlphabet().toString();
		v+= this.getTape().toString();
		v+= this.getInstructions().toString();
		v+= this.getStateRegister().toString();
		return v;
	}
	
	/**
	 * Gets number of actions executed
	 * @return numberAction
	 */
	public int getNumberAction() {
		return numberAction;
	}

	/**
	 * Sets number of actions executed
	 * @param numberAction number of actions executed
	 */
	public void setNumberAction(int numberAction) {
		this.numberAction = numberAction;
	}

	/**
	 * Gets head
	 * @return head
	 */
	public Head getHead() {
		return head;
	}

	/**
	 * Sets head
	 * @param head head
	 */
	public void setHead(Head head) {
		this.head = head;
	}

	/**
	 * Gets stateRegister
	 * @return stateRegister
	 */
	public StateRegister getStateRegister() {
		return stateRegister;
	}

	/**
	 * Sets state register
	 * @param stateRegister state register
	 */
	public void setStateRegister(StateRegister stateRegister) {
		this.stateRegister = stateRegister;
	}

	/**
	 * Gets instructions
	 * @return instructions
	 */
	public Instructions getInstructions() {
		return instructions;
	}

	/**
	 * Sets instructions
	 * @param instructions instructions
	 */
	public void setInstructions(Instructions instructions) {
		this.instructions = instructions;
	}

	/**
	 * Gets tape
	 * @return tape
	 */
	public Tape getTape() {
		return tape;
	}

	/**
	 * Sets tape
	 * @param tape tape
	 */
	public void setTape(Tape tape) {
		this.tape = tape;
	}

	/**
	 * Gets alphabet
	 * @return alphabet
	 */
	public Alphabet getAlphabet() {
		return alphabet;
	}

	/**
	 * Sets alphabet
	 * @param alphabet alphabet
	 */
	public void setAlphabet(Alphabet alphabet) {
		this.alphabet = alphabet;
	}
	
	
}
