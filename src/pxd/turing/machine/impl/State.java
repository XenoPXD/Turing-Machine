package pxd.turing.machine.impl;

/**
 * State of the Turing Machine.
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
public class State {

	private String value;

	public State() {
	}
	
	/**
	 * Constructor with value.
	 * @param value value of the state
	 */
	public State(String value) {
		this.value = value;
	}

	/**
	 * Gets value of the state
	 * @return value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets value of the state
	 * @param value value of the state
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
}
