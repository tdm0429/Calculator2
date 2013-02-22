package edu.ycp.cs320.calculator.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Button;

import edu.ycp.cs320.calculator.RocketPadsFrame;
import edu.ycp.cs320.calculator.GameList;


public class Game_Selection extends Composite {
	
	private RocketPadsFrame floor;
	private Button selector;
	private InlineLabel gameSelection;
	private ListBox gameListBox;
	
	
	public Game_Selection(){
		
		LayoutPanel layoutPanel = new LayoutPanel();
		initWidget(layoutPanel);
		
		gameSelection = new InlineLabel("Game:");
		layoutPanel.add(gameSelection);
		layoutPanel.setWidgetLeftWidth(gameSelection, 10.0, Unit.PX, 80.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(gameSelection, 40.0, Unit.PX, 18.0, Unit.PX);
		
		gameListBox = new ListBox();
		layoutPanel.add(gameListBox);
		layoutPanel.setWidgetLeftWidth(gameListBox, 130.0, Unit.PX, 195.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(gameListBox, 40.0, Unit.PX, 28.0, Unit.PX);
		
		selector = new Button();
		layoutPanel.add(selector);
		layoutPanel.setWidgetLeftWidth(selector, 150.0, Unit.PX, 200.0, Unit.PX);
		layoutPanel.setWidgetTopHeight(selector, 40.0, Unit.PX, 35.0, Unit.PX);
	}
	
	
	public void setFloor(RocketPadsFrame floor){
		this.floor = floor;
	}
	
	public void update(){
		if (gameListBox.getItemCount() == 0) {
			GameList[] games = GameList.values();
			for (GameList g : games) {
				gameListBox.addItem(g.toString());
			}
		}
	}

}