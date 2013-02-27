package edu.ycp.cs320.calculator.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ycp.cs320.calculator.client.GreetingService;
import edu.ycp.cs320.calculator.client.UserInterface;

public class CalculatorServerImpl extends RemoteServiceServlet implements GreetingService {
	private static final long serialVersionUID = 1L;

	@Override
	public Boolean hello(String message) {
		System.out.println("Hello: " + message);
		return true;
	}
	
	@Override
	public Boolean placeOrder(Game_Selection game, String customerName,
			String customerAddress) {
		System.out.println("Pizza order received!");
		
		// TODO
		
		return true;
	}

}
