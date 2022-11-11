package UserInterface;

import StoreLogic.Category;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WindowStore extends Category implements ActionListener {

     private static final JFrame frame = new JFrame("Inner store");
     private static final JPanel panel = new JPanel();

    public WindowStore() {

        panel.setPreferredSize(new Dimension(800, 700));

        Category category = new Category();

        JList<String> vegetables = new JList<>(category.getVegetableProducts());
        vegetables.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JList<String> meat = new JList<>(category.getMeatProducts());
        meat.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JList<String> cheeses = new JList<>(category.getCheeseProducts());
        cheeses.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JList<String> fish = new JList<>(category.getFishProducts());
        fish.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JButton okClick = new JButton("OK");
        okClick.addActionListener(this);

        frame.add(panel);
        panel.add(okClick);
        panel.add(vegetables);
        panel.add(meat);
        panel.add(cheeses);
        panel.add(fish);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}