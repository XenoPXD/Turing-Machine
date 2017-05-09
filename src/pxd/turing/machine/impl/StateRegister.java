package pxd.turing.machine.impl;

import java.util.HashSet;
import java.util.Set;

/**
 * A state register that stores the state of the Turing machine.
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
public class StateRegister {
	
	private State stateOfTheTuringMachine;
	private State startState;
	private State endState;
	private Set<State> listStates = new HashSet<State>();
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String v = "StateRegister :\nstartState : " + startState.getValue() + "\n";
		v+="endState :  : " + endState.getValue() + "\n";
		v+="stateOfTheTuringMachine : " + stateOfTheTuringMachine.getValue() + "\n";
		v+="List State : ";
		for (State state : listStates) {
			v+=state.getValue()+ " ";
		}
		return v+ "\n";
	}
	
	/**
	 * Gets the end state
	 * @return endState
	 */
	public State getEndState() {
		return endState;
	}
	
	public void setEndState(State endState) {
		this.endState = endState;
	}
	
	/**
	 * Gets current state of the turing machine
	 * @return stateOfTheTuringMachine
	 */
	public State getStateOfTheTuringMachine() {
		return stateOfTheTuringMachine;
	}
	
	public void setStateOfTheTuringMachine(State stateOfTheTuringMachine) {
		this.stateOfTheTuringMachine = stateOfTheTuringMachine;
	}
	
	/**
	 * Gets start State
	 * @return startState
	 */
	public State getStartState() {
		return startState;
	}
	
	/**
	 * Sets start State
	 * @param startState  start State
	 */
	public void setStartState(State startState) {
		this.startState = startState;
	}
	
	/**
	 * Gets state list
	 * @return symbol
	 */
	public Set<State> getListStates() {
		return listStates;
	}
	
	/**
	 * Sets state list
	 * @param listStates state list
	 */
	public void setListStates(Set<State> listStates) {
		this.listStates = listStates;
	}
	
}
