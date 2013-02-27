package JUnit;

import edu.ycp.cs320.calculator.RocketPadsLocation;
import edu.ycp.cs320.calculator.RocketPadsPlayer;
import junit.framework.TestCase;

public class RocketPadsLocationTest extends TestCase
{
private RocketPadsLocation testLocationA, testLocationB, testLocationC, testLocationD;
	
	@Override
	protected void setUp() throws Exception 
	{
		testLocationA = new RocketPadsLocation(4,4);
		testLocationB = new RocketPadsLocation(0,0);
		testLocationC = new RocketPadsLocation(5,5);
		testLocationD = new RocketPadsLocation(5,5);
	}
	
	public void testGetX() throws Exception
	{
		assertEquals(4, testLocationA.getX());
	}
	
	public void testGetY() throws Exception
	{
		assertEquals(4, testLocationA.getY());
	}
	
	public void testSetX() throws Exception
	{
		testLocationA.setX(3);
		assertEquals(3, testLocationA.getX());
	}
	
	public void testSetY() throws Exception
	{
		testLocationA.setY(3);
		assertEquals(3, testLocationA.getY());
	}
	
	public void testCompareLocTo() throws Exception
	{
		assertEquals(1, testLocationD.compareLocTo(testLocationC));
		assertEquals(-1, testLocationC.compareLocTo(testLocationB));
	}
}
