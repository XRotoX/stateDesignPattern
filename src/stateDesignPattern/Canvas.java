package stateDesignPattern;

public class Canvas{
	private State state;

	public Canvas() {
		state = new RedState();
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	

}
