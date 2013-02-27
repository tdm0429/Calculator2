package edu.ycp.cs320.calculator;

public class RocketPadsLocation 
{
	// Fields
	private int x, y; //dx, dy;
	
	RocketPadsLocation(int X, int Y) //, int DX, int DY)
	{
		x = X;
		y = Y;
//		dx = DX;
//		dy = DY;
	}

	public void setX(int X)
	{
		x = X;
	}
	
	public void setY(int Y)
	{
		y = Y;
	}
	

//	public void setDX(int DX)
//	{
//		dx = DX;
//	}
//	
//	public void setDY(int DY)
//	{
//		dy = DY;
//	}
	
	
		public int getX()
		{
			return x;
		}
		
		public int getY()
		{
			return y;
		}
		
//		public int getDX()
//		{
//			return dx;
//		}
//		
//		public int getDY()
//		{
//			return dy;
//		}
	
	// Compares this location to the argument location. If they are the same, returns 1. Otherwise, returns -1.
	public int compareLocTo(RocketPadsLocation location)
	{
		if(this.x == location.x && this.y == location.y)
			return 1;
		else
			return -1;
	}
}

/*
 * 
 * 
 *	ROW 1:
 *  Panel 1: if (x >= 0 && x <= 74 && y >= 0 && y <=74)
 *  Panel 2: if (x >= 75 && x <= 149 && y >= 0 && y <=74)
 *  Panel 3: if (x >= 150 && x <= 224 && y >= 0 && y <=74)
 *  Panel 4: if (x >= 225 && x <= 299 && y >= 0 && y <=74)
 *  Panel 5: if (x >= 300 && x <= 374 && y >= 0 && y <=74)
 *  Panel 6: if (x >= 375 && x <= 449 && y >= 0 && y <=74)
 *  Panel 7: if (x >= 450 && x <= 524 && y >= 0 && y <=74)
 *  Panel 8: if (x >= 525 && x <= 599 && y >= 0 && y <=74)
 *  Panel 9: if (x >= 600 && x <= 674 && y >= 0 && y <=74)
 *  Panel 10: if (x >= 675 && x <= 749 && y >= 0 && y <=74)
 *  Panel 11: if (x >= 750 && x <= 824 && y >= 0 && y <=74)
 *  Panel 12: if (x >= 825 && x <= 900 && y >= 0 && y <=74)
 *  
 *  ROW 2:
 *  Panel 1: if (x >= 0 && x <= 74 && y >= 75 && y <=149)
 *  Panel 2: if (x >= 75 && x <= 149 && y >= 75 && y <=149)
 *  Panel 3: if (x >= 150 && x <= 224 && y >= 75 && y <=149)
 *  Panel 4: if (x >= 225 && x <= 299 && y >= 75 && y <=149)
 *  Panel 5: if (x >= 300 && x <= 374 && y >= 75 && y <=149)
 *  Panel 6: if (x >= 375 && x <= 449 && y >= 75 && y <=149)
 *  Panel 7: if (x >= 450 && x <= 524 && y >= 75 && y <=149)
 *  Panel 8: if (x >= 525 && x <= 599 && y >= 75 && y <=149)
 *  Panel 9: if (x >= 600 && x <= 674 && y >= 75 && y <=149)
 *  Panel 10: if (x >= 675 && x <= 749 && y >= 75 && y <=149)
 *  Panel 11: if (x >= 750 && x <= 824 && y >= 75 && y <=149)
 *  Panel 12: if (x >= 825 && x <= 900 && y >= 75 && y <=149)

 *  ROW 3:
 *  Panel 1: if (x >= 0 && x <= 74 && y >= 150 && y <=224)
 *  Panel 2: if (x >= 75 && x <= 149 && y >= 150 && y <=224)
 *  Panel 3: if (x >= 150 && x <= 224 && y >= 150 && y <=224)
 *  Panel 4: if (x >= 225 && x <= 299 && y >= 150 && y <=224)
 *  Panel 5: if (x >= 300 && x <= 374 && y >= 150 && y <=224)
 *  Panel 6: if (x >= 375 && x <= 449 && y >= 150 && y <=224)
 *  Panel 7: if (x >= 450 && x <= 524 && y >= 150 && y <=224)
 *  Panel 8: if (x >= 525 && x <= 599 && y >= 150 && y <=224)
 *  Panel 9: if (x >= 600 && x <= 674 && y >= 150 && y <=224)
 *  Panel 10: if (x >= 675 && x <= 749 && y >= 150 && y <=224)
 *  Panel 11: if (x >= 750 && x <= 824 && y >= 150 && y <=224)
 *  Panel 12: if (x >= 825 && x <= 900 && y >= 150 && y <=224)
 *  
 *  ROW 4:
 *  Panel 1: if (x >= 0 && x <= 74 && y >= 225 && y <=299)
 *  Panel 2: if (x >= 75 && x <= 149 && y >= 225 && y <=299)
 *  Panel 3: if (x >= 150 && x <= 224 && y >= 225 && y <=299)
 *  Panel 4: if (x >= 225 && x <= 299 && y >= 225 && y <=299)
 *  Panel 5: if (x >= 300 && x <= 374 && y >= 225 && y <=299)
 *  Panel 6: if (x >= 375 && x <= 449 && y >= 225 && y <=299)
 *  Panel 7: if (x >= 450 && x <= 524 && y >= 225 && y <=299)
 *  Panel 8: if (x >= 525 && x <= 599 && y >= 225 && y <=299)
 *  Panel 9: if (x >= 600 && x <= 674 && y >= 225 && y <=299)
 *  Panel 10: if (x >= 675 && x <= 749 && y >= 225 && y <=299)
 *  Panel 11: if (x >= 750 && x <= 824 && y >= 225 && y <=299)
 *  Panel 12: if (x >= 825 && x <= 900 && y >= 225 && y <=299)
 *  
 *  ROW 5:
 *  Panel 1: if (x >= 0 && x <= 74 && y >= 300 && y <=374)
 *  Panel 2: if (x >= 75 && x <= 149 && y >= 300 && y <=374)
 *  Panel 3: if (x >= 150 && x <= 224 && y >= 300 && y <=374)
 *  Panel 4: if (x >= 225 && x <= 299 && y >= 300 && y <=374)
 *  Panel 5: if (x >= 300 && x <= 374 && y >= 300 && y <=374)
 *  Panel 6: if (x >= 375 && x <= 449 && y >= 300 && y <=374)
 *  Panel 7: if (x >= 450 && x <= 524 && y >= 300 && y <=374)
 *  Panel 8: if (x >= 525 && x <= 599 && y >= 300 && y <=374)
 *  Panel 9: if (x >= 600 && x <= 674 && y >= 300 && y <=374)
 *  Panel 10: if (x >= 675 && x <= 749 && y >= 300 && y <=374)
 *  Panel 11: if (x >= 750 && x <= 824 && y >= 300 && y <=374)
 *  Panel 12: if (x >= 825 && x <= 900 && y >= 300 && y <=374)
 *  
 *  ROW 6:
 *  Panel 1: if (x >= 0 && x <= 74 && y >= 375 && y <=449)
 *  Panel 2: if (x >= 75 && x <= 149 && y >= 375 && y <=449)
 *  Panel 3: if (x >= 150 && x <= 224 && y >= 375 && y <=449)
 *  Panel 4: if (x >= 225 && x <= 299 && y >= 375 && y <=449)
 *  Panel 5: if (x >= 300 && x <= 374 && y >= 375 && y <=449)
 *  Panel 6: if (x >= 375 && x <= 449 && y >= 375 && y <=449)
 *  Panel 7: if (x >= 450 && x <= 524 && y >= 375 && y <=449)
 *  Panel 8: if (x >= 525 && x <= 599 && y >= 375 && y <=449)
 *  Panel 9: if (x >= 600 && x <= 674 && y >= 375 && y <=449)
 *  Panel 10: if (x >= 675 && x <= 749 && y >= 375 && y <=449)
 *  Panel 11: if (x >= 750 && x <= 824 && y >= 375 && y <=449)
 *  Panel 12: if (x >= 825 && x <= 900 && y >= 375 && y <=449)
 *  
 *  ROW 7:
 *  Panel 1: if (x >= 0 && x <= 74 && y >= 450 && y <=524)
 *  Panel 2: if (x >= 75 && x <= 149 && y >= 450 && y <=524)
 *  Panel 3: if (x >= 150 && x <= 224 && y >= 450 && y <=524)
 *  Panel 4: if (x >= 225 && x <= 299 && y >= 450 && y <=524)
 *  Panel 5: if (x >= 300 && x <= 374 && y >= 450 && y <=524)
 *  Panel 6: if (x >= 375 && x <= 449 && y >= 450 && y <=524)
 *  Panel 7: if (x >= 450 && x <= 524 && y >= 450 && y <=524)
 *  Panel 8: if (x >= 525 && x <= 599 && y >= 450 && y <=524)
 *  Panel 9: if (x >= 600 && x <= 674 && y >= 450 && y <=524)
 *  Panel 10: if (x >= 675 && x <= 749 && y >= 450 && y <=524)
 *  Panel 11: if (x >= 750 && x <= 824 && y >= 450 && y <=524)
 *  Panel 12: if (x >= 825 && x <= 900 && y >= 450 && y <=524)
 *  
 *  ROW 8:
 *  Panel 1: if (x >= 0 && x <= 74 && y >= 525 && y <=599)
 *  Panel 2: if (x >= 75 && x <= 149 && y >= 525 && y <=599)
 *  Panel 3: if (x >= 150 && x <= 224 && y >= 525 && y <=599)
 *  Panel 4: if (x >= 225 && x <= 299 && y >= 525 && y <=599)
 *  Panel 5: if (x >= 300 && x <= 374 && y >= 525 && y <=599)
 *  Panel 6: if (x >= 375 && x <= 449 && y >= 525 && y <=599)
 *  Panel 7: if (x >= 450 && x <= 524 && y >= 525 && y <=599)
 *  Panel 8: if (x >= 525 && x <= 599 && y >= 525 && y <=599)
 *  Panel 9: if (x >= 600 && x <= 674 && y >= 525 && y <=599)
 *  Panel 10: if (x >= 675 && x <= 749 && y >= 525 && y <=599)
 *  Panel 11: if (x >= 750 && x <= 824 && y >= 525 && y <=599)
 *  Panel 12: if (x >= 825 && x <= 900 && y >= 525 && y <=599)
 *  
 *  ROW 9:
 *  Panel 1: if (x >= 0 && x <= 74 && y >= 600 && y <=674)
 *  Panel 2: if (x >= 75 && x <= 149 && y >= 600 && y <=674)
 *  Panel 3: if (x >= 150 && x <= 224 && y >= 600 && y <=674)
 *  Panel 4: if (x >= 225 && x <= 299 && y >= 600 && y <=674)
 *  Panel 5: if (x >= 300 && x <= 374 && y >= 600 && y <=674)
 *  Panel 6: if (x >= 375 && x <= 449 && y >= 600 && y <=674)
 *  Panel 7: if (x >= 450 && x <= 524 && y >= 600 && y <=674)
 *  Panel 8: if (x >= 525 && x <= 599 && y >= 600 && y <=674)
 *  Panel 9: if (x >= 600 && x <= 674 && y >= 600 && y <=674)
 *  Panel 10: if (x >= 675 && x <= 749 && y >= 600 && y <=674)
 *  Panel 11: if (x >= 750 && x <= 824 && y >= 600 && y <=674)
 *  Panel 12: if (x >= 825 && x <= 900 && y >= 600 && y <=674)
 *  
 *  ROW 10:
 *  Panel 1: if (x >= 0 && x <= 74 && y >= 675 && y <=749)
 *  Panel 2: if (x >= 75 && x <= 149 && y >= 675 && y <=749)
 *  Panel 3: if (x >= 150 && x <= 224 && y >= 675 && y <=749)
 *  Panel 4: if (x >= 225 && x <= 299 && y >= 675 && y <=749)
 *  Panel 5: if (x >= 300 && x <= 374 && y >= 675 && y <=749)
 *  Panel 6: if (x >= 375 && x <= 449 && y >= 675 && y <=749)
 *  Panel 7: if (x >= 450 && x <= 524 && y >= 675 && y <=749)
 *  Panel 8: if (x >= 525 && x <= 599 && y >= 675 && y <=749)
 *  Panel 9: if (x >= 600 && x <= 674 && y >= 675 && y <=749)
 *  Panel 10: if (x >= 675 && x <= 749 && y >= 675 && y <=749)
 *  Panel 11: if (x >= 750 && x <= 824 && y >= 675 && y <=749)
 *  Panel 12: if (x >= 825 && x <= 900 && y >= 675 && y <=749)
 *  
 *  ROW 11:
 *  Panel 1: if (x >= 0 && x <= 74 && y >= 750 && y <=824)
 *  Panel 2: if (x >= 75 && x <= 149 && y >= 750 && y <=824)
 *  Panel 3: if (x >= 150 && x <= 224 && y >= 750 && y <=824)
 *  Panel 4: if (x >= 225 && x <= 299 && y >= 750 && y <=824)
 *  Panel 5: if (x >= 300 && x <= 374 && y >= 750 && y <=824)
 *  Panel 6: if (x >= 375 && x <= 449 && y >= 750 && y <=824)
 *  Panel 7: if (x >= 450 && x <= 524 && y >= 750 && y <=824)
 *  Panel 8: if (x >= 525 && x <= 599 && y >= 750 && y <=824)
 *  Panel 9: if (x >= 600 && x <= 674 && y >= 750 && y <=824)
 *  Panel 10: if (x >= 675 && x <= 749 && y >= 750 && y <=824)
 *  Panel 11: if (x >= 750 && x <= 824 && y >= 750 && y <=824)
 *  Panel 12: if (x >= 825 && x <= 900 && y >= 750 && y <=824)
 *  
 *  ROW 12:
 *  Panel 1: if (x >= 0 && x <= 74 && y >= 825 && y <=900)
 *  Panel 2: if (x >= 75 && x <= 149 && y >= 825 && y <=900)
 *  Panel 3: if (x >= 150 && x <= 224 && y >= 825 && y <=900)
 *  Panel 4: if (x >= 225 && x <= 299 && y >= 825 && y <=900)
 *  Panel 5: if (x >= 300 && x <= 374 && y >= 825 && y <=900)
 *  Panel 6: if (x >= 375 && x <= 449 && y >= 825 && y <=900)
 *  Panel 7: if (x >= 450 && x <= 524 && y >= 825 && y <=900)
 *  Panel 8: if (x >= 525 && x <= 599 && y >= 825 && y <=900)
 *  Panel 9: if (x >= 600 && x <= 674 && y >= 825 && y <=900)
 *  Panel 10: if (x >= 675 && x <= 749 && y >= 825 && y <=900)
 *  Panel 11: if (x >= 750 && x <= 824 && y >= 825 && y <=900)
 *  Panel 12: if (x >= 825 && x <= 900 && y >= 825 && y <=900)
 *  
 */
