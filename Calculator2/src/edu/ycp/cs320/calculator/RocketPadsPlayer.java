package edu.ycp.cs320.calculator;

public class RocketPadsPlayer 
{
	// Fields
	private int dx, dy; // Direction (+X for positive, 0 for stationary, -X for negative).
	private RocketPadsLocation start, current;
	private RocketPadsDirection dir;
	private boolean slide; // Determines if the player is currently sliding (in which case manual controls are disabled).
	
	// Constructor
	RocketPadsPlayer()
	{
		start = new RocketPadsLocation(0,0);
		current = new RocketPadsLocation(0,0);
		slide = false;
	}
	
	// Resets the player's location to his starting location.
	public void reset_location()
	{
		current.setX(start.getX());
		current.setY(start.getY());
	}
	
	public boolean getSlide()
	{
		return slide;
	}
	
	public void setSlide(boolean s)
	{
		slide = s;
	}
	
	public void setDirection(RocketPadsDirection direction)
	{
		dir.setXDir(direction.getDX());
		dir.setYDir(direction.getDY());
	}
	
	// Updates the player's position.
	public void updatePosition()
	{
		current.setX(current.getX() + dx);
		current.setY(current.getY() + dy);
	}
}
