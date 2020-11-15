package stateDesignPattern;


public class RedState implements State{
	
	
	@Override
	public void setFor(Canvas canvas) {
		canvas.setState(this);
	}
	
	@Override
	public String toString() {
		return "Red";
	}


}
