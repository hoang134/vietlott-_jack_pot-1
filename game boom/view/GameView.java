package view;

import java.awt.CardLayout;
import java.awt.Image;


import javax.swing.JFrame;

public class GameView {

    private JFrame view;
    public static final int WIDTHJF = 953;
    public static final int HEIGHTJF = 704;
    public MyContainer myContainer;

    public GameView() {
        view = new JFrame("");
        view.setLayout(new CardLayout());
        view.setSize(WIDTHJF, HEIGHTJF);
        view.setLocationRelativeTo(null);
        view.setResizable(false);
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myContainer = new MyContainer(this);
        view.add(myContainer.myContainer);

    }

    public JFrame getView() {
        return view;
    }

}
