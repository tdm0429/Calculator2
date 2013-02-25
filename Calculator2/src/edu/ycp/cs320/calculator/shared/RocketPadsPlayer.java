package edu.ycp.cs320.calculator.shared;

public class RocketPadsPlayer 
{
	// Fields
	private RocketPadsLocation start, current;
	private RocketPadsDirection dir;
	private boolean slide; // Determines if the player is currently sliding (in which case manual controls are disabled).
	
	// Constructor
	public RocketPadsPlayer()
	{
		start = new RocketPadsLocation(0,0);
		current = new RocketPadsLocation(0,0);
		slide = false;
	}
	
	public RocketPadsLocation getLocation(){
		return current;
	}
	
	// Resets the player's location to his starting location.
	public void reset_location()
	{
		current.setX(start.getX());
		current.setY(start.getY());
	}
	
	public void setLocation(int x, int y){
		current = new RocketPadsLocation(x,y);
	}
	
	public boolean getSlide()
	{
		return slide;
	}
	
	public void setSlide(boolean s)
	{
		slide = s;
	}

}
