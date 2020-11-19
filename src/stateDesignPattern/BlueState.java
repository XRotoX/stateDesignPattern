package stateDesignPattern;

import java.awt.Color;

public class BlueState implements State{


	@Override
	public void handlePush(Canvas canvas) {
		canvas.setState(new GreenState());
	}
	
	@Override
	public void handlePull(Canvas canvas) {
		canvas.setState(new BlackState());
	}
	
	@Override
	public Color getColor() {
		return Color.BLUE;
	}
	
	@Override
	public String toString() {
		return "Blue";
	}

}
