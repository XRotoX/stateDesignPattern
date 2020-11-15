package stateDesignPattern;

public class BlackState implements State{


	@Override
	public void setFor(Canvas canvas) {
		canvas.setState(this);
	}
	
	@Override
	public String toString() {
		return "Black";
	}

}
