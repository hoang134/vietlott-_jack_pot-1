package RunGame;

import controller.ControllerMain;
import controller.ControllerView;

import view.GameView;

public class RunGame {
	public static void main(String[] args) {
		GameView view = new GameView();

		ControllerMain controller = new ControllerView( view);
		controller.displayGame();

		view.getView().setVisible(true);
	}
}
