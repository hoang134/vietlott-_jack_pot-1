package view;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import sound.GameSound;
import Countdown.Countdown;

public class MyContainer {

	protected JPanel myContainer;
	private static final String TAG_MENU = "tag_menu";
	private static final String TAG_PLAYGAME = "tag_playgame";

	
	private static final String TAG_ACTOR = "tag_actor";
	private CardLayout mCardLayout;
	private GameView gameView;
	private MenuView menu;
	private PlayGame play;

	

	 private Countdown countdown;

	public MyContainer(GameView gameView) {
		myContainer = new JPanel();
		 countdown = new Countdown();
		this.gameView = gameView;
		myContainer.setBackground(Color.WHITE);
		mCardLayout = new CardLayout();
		myContainer.setLayout(mCardLayout);
		menu = new MenuView();
		myContainer.add(menu.menuPanel, TAG_MENU);
		play = new PlayGame(this);
		myContainer.add(play.playGamePanel, TAG_PLAYGAME);

		

	}

	public MenuView getMenu() {
		return menu;
	}

	public PlayGame getPlay() {
		return play;
	}



	public GameView getGui() {
		return gameView;
	}

	



	public void setShowMenu() {
		mCardLayout.show(this.myContainer, TAG_MENU);
		menu.menuPanel.requestFocus();
		GameSound.getIstance().stop();
		GameSound.getIstance().getAudio(GameSound.MENU).loop();
	}

	public void setShowPlay(int type) {
		play.chooseActor(type);
		
		mCardLayout.show(this.myContainer, TAG_PLAYGAME);
		play.playGamePanel.requestFocus();
		GameSound.getIstance().stop();
		
		GameSound.getIstance().getAudio(GameSound.PLAYGAME).loop();
	}



}
