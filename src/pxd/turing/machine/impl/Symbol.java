package pxd.turing.machine.impl;

/**
 * Symbols could be printed.
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
public class Symbol {

	private String name;
	private String value;
	
	public static final String BLANK = "blank";
	
	public Symbol() {
	}
	
	/**
	 * Constructor with name and value.
	 * @param name name
	 * @param value value
	 */
	public Symbol(final String name, final String value) {
		this.name = name;
		this.value = value;
	}
	
	/**
	 * Gets name of the symbol
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets name of the symbol
	 * @param name name of the symbol
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets value of the symbol
	 * @return value
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * Sets value of the symbol
	 * @param value value of the symbol
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
}
