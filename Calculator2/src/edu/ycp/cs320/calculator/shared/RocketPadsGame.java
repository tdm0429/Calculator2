package edu.ycp.cs320.calculator.shared;

public class RocketPadsGame 
{
	// Fields
	int dx, dy; // Direction (+X for positive, 0 for stationary, -X for negative)
	int currentX, currentY; // Current position
	int startX, startY; // Original position
	int winX, winY; // Location of the winning area
	int length, width; // Dimensions of the playing area
	boolean slide; // Determines if the player is currently sliding (in which case manual controls are disabled)
	boolean win; // When true, game ends.
	
	// Constructor
	RocketPadsGame()
	{
		// These values are arbitrary and should be changed as needed.
		length = 600;
		width = 600;
		dx = 0;
		dy = 0;
		currentX = 0;
		currentY = 0;
		startX = 0;
		startY = 0;
		winX = 300;
		winY = 300;
		slide = false;
		win = false;
	}
	
	public void reset_location()
	{
		currentX = startX;
		currentY = startY;
	}
	
	public boolean getSlide()
	{
		return slide;
	}
	
	public void setSlide(boolean s)
	{
		slide = s;
	}
	
	public void updatePosition()
	{
		currentX += dx;
		currentY += dy;
	}
	
	public boolean checkVictory()
	{
		if(startX == winX && startY == winY)
			win = true;
		
		return win;
	}
	
}
