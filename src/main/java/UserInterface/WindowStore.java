package UserInterface;

import StoreLogic.Category;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WindowStore extends Category implements ActionListener {

     private static final JFrame frame = new JFrame("Inner store");
     private static final JPanel panel = new JPanel();

    public WindowStore() {

        panel.setPreferredSize(new Dimension(800, 700));

        JList<String> enumeration = new JList<>(Category.product.toArray(getFishProducts()));
        enumeration.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JButton okClick = new JButton("OK");
        okClick.setLocation(900, 350);
        okClick.addActionListener(this);


        frame.add(panel);
        panel.add(enumeration);
        panel.add(okClick);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}