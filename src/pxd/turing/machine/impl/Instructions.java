package pxd.turing.machine.impl;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Instructions is an action list.
 * @author Xavier PRUNCK
 * @version 1.0, 24/04/2017
 */
public class Instructions {

	private Map<String, Action> actions = new HashMap<String, Action>();

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String v = "Instructions :\nnb action : " + actions.size() + "\n";
		
		Map<String, Action> treeMap = new TreeMap<String, Action>(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
		
		treeMap.putAll(actions);
		
		for (Map.Entry<String, Action> entry : treeMap.entrySet()) {
			v+= entry.getKey().toString() + "=" + entry.getValue().toString() + "\n";
		}
		return v+"\n";
	}
	
	/**
	 * Gets instructions list
	 * @return actions instructions list
	 */
	public Map<String, Action> getActions() {
		return actions;
	}
	
	/**
	 * Sets instructions list
	 * @param actions instructions list
	 */
	public void setActions(Map<String, Action> actions) {
		this.actions = actions;
	}
	
	
	
}
