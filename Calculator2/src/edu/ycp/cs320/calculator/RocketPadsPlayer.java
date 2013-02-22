package edu.ycp.cs320.calculator;

public class RocketPadsPlayer 
{
	// Fields
	private RocketPadsLocation start, current;
	private RocketPadsDirection dir;
	private boolean slide; // Determines if the player is currently sliding (in which case manual controls are disabled).
	
	// Constructor
	RocketPadsPlayer()
	{
		start = new RocketPadsLocation(0,0);
		current = new RocketPadsLocation(0,0);
		dir = RocketPadsDirection.WALK;
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
	
	// Updates the player's position.
	public void updatePosition()
	{
		
	}
}
