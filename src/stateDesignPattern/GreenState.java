package stateDesignPattern;

import java.awt.Color;

public class GreenState implements State{


	@Override
	public void handlePush(Canvas canvas) {
		canvas.setState(new BlackState());
	}
	
	@Override
	public void handlePull(Canvas canvas) {
		canvas.setState(new BlueState());
	}

	@Override
	public Color getColor() {
		return Color.GREEN;
	}
	@Override
	public String toString() {
		return "Green";
	}
	
	

}
