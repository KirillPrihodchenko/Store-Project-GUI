package UserInterface;

import javax.swing.*;

public class WindowStore {

    private static final JFrame frame = new JFrame();
    private static final JPanel panel = new JPanel();

    public void PushWindow() {

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        panel.setLayout(null);
    }
}
