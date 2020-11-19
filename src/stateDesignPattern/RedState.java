package stateDesignPattern;

import java.awt.Color;

public class RedState implements State{
	
	
	@Override
	public void handlePush(Canvas canvas) {
		canvas.setState(new BlueState());
	}
	
	@Override
	public void handlePull(Canvas canvas) {
		canvas.setState(new GreenState());
	}
	
	@Override
	public Color getColor() {
		return Color.RED;
	}
	
	@Override
	public String toString() {
		return "Red";
	}

	


}
