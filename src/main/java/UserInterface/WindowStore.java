package UserInterface;

import StoreLogic.Category;

import javax.swing.*;
import java.awt.*;

public class WindowStore extends Category {

    private static final JFrame frame = new JFrame("Inner store");
    private static final JPanel panel = new JPanel();

    public WindowStore() {

        panel.setPreferredSize(new Dimension(800, 600));

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
