/********************************************************
 *
 *  Name    :  <Name of programmer>
 *
 *  Project :  a04_Prototype
 *  File    :  PrototypeGUI.java
 *  Date    :  Sep 26, 2012
 *
 ********************************************************/
package Prototype;

import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PrototypeGUI extends JPanel
{
	//TODO Move all array initialization to a private method
	private Point[] p1Points  = {
			new Point(228, 450),
			new Point(228, 670),
			new Point(130, 670),
			new Point(88, 632),
			new Point(88, 487),
			new Point(123, 450)};
	
	private Point[] p2Points = {
			new Point(210, 65),
			new Point(336, 65),
			new Point(336, 221),
			new Point(254, 221),
			new Point(254, 180),
			new Point(210, 180)};
	
	private Point[] p3Points = {
			new Point(795, 247),
			new Point(900, 247),
			new Point(900, 360),
			new Point(807, 360),
			new Point(807, 305),
			new Point(795, 284)};
	
	private Point[] p4Points = {
			new Point(690, 230),
			new Point(780, 230),
			new Point(780, 293),
			new Point(795, 310),
			new Point(795, 359),
			new Point(689, 358)};
	
	private Point[] p5Points = {
			new Point(364, 65),
			new Point(414, 73),
			new Point(461, 88),
			new Point(544, 128),
			new Point(544, 239),
			new Point(364, 239)};
	
	private Point[] p6Points = {
			new Point(563, 139),
			new Point(685, 191),
			new Point(685, 245),
			new Point(564, 246)};
	
	private Point[] p7Points = {
			new Point(747, 592),
			new Point(822, 592),
			new Point(822, 585),
			new Point(882, 585),
			new Point(882, 680),
			new Point(747, 681)};
	
	private Point[] p8Points = {
			new Point(505, 645),
			new Point(744, 645),
			new Point(744, 685),
			new Point(505, 685)};
	
	private Point[] p9Points = {
			new Point(79, 68),
			new Point(105, 68),
			new Point(105, 74),
			new Point(111, 74),
			new Point(111, 123),
			new Point(72, 123),
			new Point(72, 74),
			new Point(79, 74)};
	
	
	private ParkingLot[] parkingLots = {
			new ParkingLot (p1Points),
			new ParkingLot (p2Points),
			new ParkingLot (p3Points),
			new ParkingLot (p4Points),
			new ParkingLot (p5Points),
			new ParkingLot (p6Points),
			new ParkingLot (p7Points),
			new ParkingLot (p8Points),
			new ParkingLot (p9Points)};
	
	private ImageIcon aerialPhoto = new ImageIcon(getClass().getResource("SLCC_Photo.png"));
	
	public PrototypeGUI()
	{
		super();
		setSize(950, 750);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//TODO Make it so the back ground photo doesn't draw every time
		aerialPhoto.paintIcon(this, g, 0, 0);
		
		for(ParkingLot lot : parkingLots)
		{
			//TODO figure out how to make the polygons draw translucent 
			g.setColor(lot.getLotColor());
			g.fillPolygon(lot);
		}
	}
	
	public void update(double testUpdate)
	{
		Random generator = new Random();
		
		parkingLots[generator.nextInt(parkingLots.length)].updateWaitTime(testUpdate);	
		
		repaint();
	}
	

}
