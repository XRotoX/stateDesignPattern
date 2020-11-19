package stateDesignPattern;

import java.awt.Color;

public abstract interface State {
	public void handlePush(Canvas canvas);
	public void handlePull(Canvas canvas);
	public Color getColor();
}
