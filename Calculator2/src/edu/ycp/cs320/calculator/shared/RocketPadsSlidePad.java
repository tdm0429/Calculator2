package edu.ycp.cs320.calculator.shared;

public class RocketPadsSlidePad 
{
	// Fields
	private RocketPadsLocation loc;
	private RocketPadsDirection dir;
	
	RocketPadsSlidePad(int X, int Y, int dX, int dY)
	{
		loc = new RocketPadsLocation(X, Y);
		dir = new RocketPadsDirection(dX, dY);
	}
	
	public int getXDir()
	{
		return dir.getDX();
	}
	
	public int getYDir()
	{
		return dir.getDY();
	}
	
	public RocketPadsLocation getLocation()
	{
		return loc;
	}
}
