package stateDesignPattern;

public class GreenState implements State{


	@Override
	public void setFor(Canvas canvas) {
		canvas.setState(this);
	}

	@Override
	public String toString() {
		return "Green";
	}
	
	

}
