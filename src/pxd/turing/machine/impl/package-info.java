/**
 * A Turing machine is an abstract machine that manipulates symbols on a strip of tape according to a table of rules; to be more exact, it is a mathematical model of computation that defines such a device.
 * <br />
 * Despite the model's simplicity, given any computer algorithm, a Turing machine can be constructed that is capable of simulating that algorithm's logic.
 * <br />
 * <br />
 * The machine operates on an infinite memory tape divided into discrete cells. The machine positions its head over a cell and "reads" (scans) the symbol there. 
 * <br />
 * Then, as per the symbol and its present place in a finite table of user-specified instructions, the machine (i) writes a symbol (e.g. a digit or a letter from a finite alphabet) in the cell (some models allowing symbol erasure and/or no writing), then (ii) either moves the tape one cell left or right (some models allow no motion, some models move the head), then (iii) (as determined by the observed symbol and the machine's place in the table) either proceeds to a subsequent instruction or halts the computation.
 * <br />
 * <br />
 * The Turing machine was invented in 1936 by Alan Turing, who called it an a-machine (automatic machine). With this model, Turing was able to answer two questions in the negative: (1) Does a machine exist that can determine whether any arbitrary machine on its tape is "circular" (e.g. freezes, or fails to continue its computational task); similarly, (2) does a machine exist that can determine whether any arbitrary machine on its tape ever prints a given symbol. Thus by providing a mathematical description of a very simple device capable of arbitrary computations, he was able to prove properties of computation in general—and in particular, the uncomputability of the Entscheidungsproblem ("decision problem").
 * <br />
 * See the <a href="https://en.wikipedia.org/wiki/Turing_machine" >definition wiki.</a>
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
package pxd.turing.machine.impl;