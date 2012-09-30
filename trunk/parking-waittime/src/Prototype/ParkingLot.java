/********************************************************
 *
 *  Name    :  <Name of programmer>
 *
 *  Project :  a04_Prototype
 *  File    :  ParkingLot.java
 *  Date    :  Sep 26, 2012
 *
 ********************************************************/
package Prototype;

import java.awt.Color;
import java.awt.Polygon;


public class ParkingLot extends Polygon
{
	
	private double waitTime;
	private Color lotColor;
	
	public ParkingLot(Point[] bndPnts)
	{	
		waitTime = 0;
		updateLotColor();
		
		for(Point p : bndPnts)
		{
			addPoint(p.getX(), p.getY());
		}
	}
	
	private void updateLotColor()
	{
		if(waitTime <= 2.0)
			lotColor = Color.GREEN;
		else if(waitTime > 2.0 && waitTime <= 4.0)
			lotColor = Color.YELLOW;
		else if(waitTime > 4.0 && waitTime <= 6.0)
			lotColor = Color.ORANGE;
		else
			lotColor = Color.RED;
	}
	
	public Color getLotColor()
	{
		return lotColor;
	}
	
	public void updateWaitTime (double newWaitTime)
	{
		waitTime = newWaitTime;
		updateLotColor();
	}
	
	public double getWaitTime()
	{
		return waitTime;
	}
}
