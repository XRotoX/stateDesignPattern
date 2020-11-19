package stateDesignPattern;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class User {

		static Color newColor;
	
public static void main(String[] args) {
	
		Canvas canvas = new Canvas();
	
		JButton btnPush = new JButton("Push"); 
		JButton btnPull = new JButton("Pull"); 
		JButton btnExit = new JButton("Exit");
		
		
		JFrame frame = new JFrame();
		
		JPanel pnlContainer = new JPanel();
		pnlContainer.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		pnlContainer.setLayout(new GridLayout(2, 1));
		
		JPanel pnlColored = new JPanel();
		pnlColored.setLayout(new GridLayout(3, 3));
		
		JPanel pnlControl = new JPanel();
		pnlControl.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
		pnlControl.setLayout(new GridLayout(1, 3));
				
		
		pnlColored.setBackground(canvas.getState().getColor());
		
		pnlControl.add(btnPush);  
		pnlControl.add(btnPull);  
		pnlControl.add(btnExit); 
		
		pnlContainer.add(pnlColored, BorderLayout.CENTER);
		pnlContainer.add(pnlControl, BorderLayout.CENTER);
		
		
		frame.add(pnlContainer, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("State Design Pattern");
		frame.pack();
		frame.setVisible(true);
		
		
		btnExit.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		    	frame.dispose();
		    }
		});
		
		btnPush.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		    	
		    	State activeState = canvas.getState();
		    	activeState.handlePush(canvas);
		    	
		    	System.out.println("Push action, setting color to: " + canvas.getState().toString());
		    	pnlColored.setBackground(canvas.getState().getColor());
		    }
		});
		
		btnPull.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e)
		    {
		    	
		    	State activeState = canvas.getState();
		    	activeState.handlePull(canvas);
		    	
		    	System.out.println("Pull action, setting color to: " + canvas.getState().toString());
		    	pnlColored.setBackground(canvas.getState().getColor());
		    }
		});
		
		
		
		
		
		
		 
	}

}
