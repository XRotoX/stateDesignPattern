package stateDesignPattern;

import java.awt.Color;

public class BlackState implements State{


	@Override
	public void handlePush(Canvas canvas) {
		canvas.setState(new RedState());
	}
	
	@Override
	public void handlePull(Canvas canvas) {
		canvas.setState(new RedState());
	}
	
	@Override
	public Color getColor() {
		return Color.BLACK;
	}
	
	@Override
	public String toString() {
		return "Black";
	}

}
