package UserInterface;

import StoreLogic.Category;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.Vector;

public class WindowStore extends Category {

    private static final JFrame frame = new JFrame("Inner store");
    private static final JPanel panel = new JPanel();
    private static Category category = new Category();
    public WindowStore() {

        panel.setPreferredSize(new Dimension(800, 700));


       JList<String> enumeration = new JList<>(Collections.singletonList(category.GroceryList()));
       enumeration.setLocation(780, 350);

        frame.add(panel);
        panel.add(enumeration);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
