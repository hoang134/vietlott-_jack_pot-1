package controller;


import view.GameView;

/**
 * @author hoang
 *
 */
public class ControllerView implements ControllerMain {


	protected GameView view;
	
	public ControllerView(GameView view) {
		this.view = view;
	}

	public void displayGame() {
		view.myContainer.setShowMenu();
		menuController();
		playGameController();

		
	}

	public void menuController() {
		new MenuControllerExt(view, this);
	}

	public void playGameController() {
		new PlayGameControllerExt(view);
	}





}