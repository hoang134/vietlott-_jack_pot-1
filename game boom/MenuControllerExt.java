package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;


import sound.GameSound;
import view.GameView;
import view.MenuView;
import view.PlayGame;

public class MenuControllerExt extends ControllerView {
	private MenuView menu;
	private ControllerView controllerView;

	public MenuControllerExt(GameView view, ControllerView controllerView) {
		super(view);
		this.controllerView = controllerView;
		menu = this.view.myContainer.getMenu();
		menu.addMenuMouseListener(new MenuMouseListener());
	}

	class MenuMouseListener extends MouseAdapter {

		@Override
		public void mouseEntered(MouseEvent e) {
			if (e.getSource() == menu.getLbPlayGame()) {
				GameSound.getIstance().getAudio(GameSound.BOMB).play();
				ImageIcon playIcon = new ImageIcon(getClass().getResource("/Images/Play2.png"));
				menu.getLbPlayGame().setIcon(playIcon);
			}

			if (e.getSource() == menu.getLbExit()) {
				GameSound.getIstance().getAudio(GameSound.BOMB).play();
				ImageIcon exitIcon = new ImageIcon(getClass().getResource("/Images/Exit2.png"));
				menu.getLbExit().setIcon(exitIcon);
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource() == menu.getLbPlayGame()) {
				ImageIcon playIcon = new ImageIcon(getClass().getResource("/Images/Play.png"));
				menu.getLbPlayGame().setIcon(playIcon);
			}

			if (e.getSource() == menu.getLbExit()) {
				ImageIcon exitIcon = new ImageIcon(getClass().getResource("/Images/Exit.png"));
				menu.getLbExit().setIcon(exitIcon);
			}
		}

		@Override
                ///////star game
		public void mousePressed(MouseEvent e) {
			if (e.getSource() == menu.getLbExit()) {
				GameSound.getIstance().getAudio(GameSound.BOMB).play();
				System.exit(0);
			}
			if (e.getSource() == menu.getLbPlayGame()) {
				GameSound.getIstance().getAudio(GameSound.BOMB).play();
//				view.myContainer.setShowActor();
                                view.myContainer.setShowPlay(1);
			}

		}
	}
}
