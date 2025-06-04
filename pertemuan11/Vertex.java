package Tugas_P10;

public class Vertex {
	
	private char label;
	private boolean wasVisited;
	
	public Vertex(char lab) {
		label = lab;
		wasVisited = false;
	}
	
	private char getLabel() {
		return label;
	}
	
	private void setLabel(char label) {
		this.label = label;
	}
	
	private boolean isWasVisited() {
		return wasVisited;
	}
	
	private void setWasVisited(boolean wasVisited) {
		this.wasVisited = wasVisited;
	}
 
}
