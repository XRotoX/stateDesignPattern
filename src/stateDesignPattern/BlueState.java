package stateDesignPattern;

public class BlueState implements State{


	@Override
	public void setFor(Canvas canvas) {
		canvas.setState(this);
	}
	
	@Override
	public String toString() {
		return "Blue";
	}

}
