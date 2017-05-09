package pxd.turing.machine.impl;

/**
 * A head that can read and write symbols on the tape and move the tape left and
 * right one (and only one) cell at a time. In some models the head moves and
 * the tape is stationary.
 * 
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
public class Head {

	private String moveLeft = "";
	private String moveRight = "";
	private String read = "";
	private String write = "";
	private int position = 0; 
	
	public Head() {
	}
	
	/**
	 * Constructor with position of the head.
	 * @param position position of the head
	 */
	public Head(int position) {
		super();
		this.position = position;
	}
	
	/**
	 * Write symbols on the tape
	 * @param tape the tape on which to write the symbol
	 * @param symbol the symbol to write on the tape
	 */
	public void write(Tape tape, final Symbol symbol) {
			tape.getListCells().get(position).setSymbol(symbol);
	}
	
	/**
	 * Move the head.
	 * @param move direction to take
	 */
	public void move(final String move) {
		int movePosition = 0;
		if (this.getMoveLeft().equals(move)) {
			movePosition = this.getPosition() - 1;
		} else if (this.getMoveRight().equals(move)) {
			movePosition = this.getPosition()  + 1;
		}
		this.setPosition(movePosition);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Head :\nposition : " + this.position + "\n";
	}
	
	/**
	 * Gets position of the head.
	 * @return position of the head
	 */
	public int getPosition() {
		return position;
	}
	
	/**
	 * Sets position of the head.
	 * @param position position of the head
	 */
	public void setPosition(int position) {
		this.position = position;
	}
	
	/**
	 * Gets string for move left of the head.
	 * @return string for move left of the head
	 */
	public String getMoveLeft() {
		return moveLeft;
	}
	
	/**
	 * Sets string for move left of the head.
	 * @param moveLeft string for move left of the head
	 */
	public void setMoveLeft(String moveLeft) {
		this.moveLeft = moveLeft;
	}
	
	/**
	 * Gets string for move right of the head.
	 * @return string for move right of the head
	 */
	public String getMoveRight() {
		return moveRight;
	}
	
	/**
	 * Sets string for move right of the head.
	 * @param moveRight string for move right of the head
	 */
	public void setMoveRight(String moveRight) {
		this.moveRight = moveRight;
	}
	

	/**
	 * Gets string for read of the head.
	 * @return string for read of the head
	 */
	public String getRead() {
		return read;
	}
	
	/**
	 * Sets string for read of the head.
	 * @param read string for read of the head
	 */
	public void setRead(String read) {
		this.read = read;
	}
	
	/**
	 * Gets string for write of the head.
	 * @return string for write of the head
	 */
	public String getWrite() {
		return write;
	}
	
	/**
	 * Sets string for write of the head.
	 * @param write string for write of the head
	 */
	public void setWrite(String write) {
		this.write = write;
	}
	
	
	
}
