package edu.ycp.cs320.calculator;

public class RocketPadsDirection 
{
	private int dx, dy;
	
	RocketPadsDirection(int dX, int dY)
	{
		dx = dX;
		dy = dY;
	}
	
	public int getDX()
	{
		return dx;
	}
	
	public int getDY()
	{
		return dy;
	}
	
	public void setXDir(int xdir)
	{
		dx = xdir;
	}
	
	public void setYDir(int ydir)
	{
		dy = ydir;
	}
}
