/********************************************************
 *
 *  Name    :  <Name of programmer>
 *
 *  Project :  a04_Prototype
 *  File    :  PrototypeApp.java
 *  Date    :  Sep 26, 2012
 *
 ********************************************************/
package Prototype;

import java.util.Random;

import javax.swing.JFrame;

public class PrototypeApp
{


	public static void main(String[] args) throws InterruptedException
	{
		
		PrototypeGUI parkingGUI = new PrototypeGUI();
		
		JFrame appFrame = new JFrame("Parking Prototype");
		appFrame.setVisible(true);
		appFrame.setSize(950, 750);
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.add(parkingGUI);
		
		while(true)
		{
			Thread.sleep(2000);
			parkingGUI.update(simulatedInput());
			parkingGUI.update(simulatedInput());
	
		}
	}
	
	private static double simulatedInput()
	{
		Random generator = new Random();
		return generator.nextDouble() * 8;
	}

}
