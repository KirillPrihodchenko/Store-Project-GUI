package UserInterface;

import StoreLogic.Category;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class WindowStore extends Category {

    private static final JFrame frame = new JFrame("Inner store");
    private static final JPanel panel = new JPanel();
    private static JButton okClick;
    private static JLabel ClickResult;

    public WindowStore() {

        panel.setPreferredSize(new Dimension(600, 400));

        Category category = new Category();
        okClick = new JButton("OK");

        JList<String> list_vegetables = new JList<>(category.getVegetableProducts());
        list_vegetables.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JList<String> list_meat = new JList<>(category.getMeatProducts());
        list_meat.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JList<String> list_cheeses = new JList<>(category.getCheeseProducts());
        list_cheeses.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JList<String> list_fish = new JList<>(category.getFishProducts());
        list_fish.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        okClick.setBounds(20, 380, 100, 50);
        ClickResult = new JLabel();

        okClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                try {

                    double val = Double.parseDouble(vegetables.get(list_vegetables.getSelectedValue()));
                    double[] arrOfProduct = new double[]{val};

                    if (event.getSource() == okClick) {
                        for (int i = 0; i < arrOfProduct.length; i++) {

                            System.out.println(i);
                        }

                        JOptionPane.showMessageDialog(panel, Arrays.toString(arrOfProduct));
                    }
                }
                catch (NumberFormatException ex) {

                    ex.getStackTrace();
                }
            }
        });

        frame.add(panel);
        panel.add(okClick);
        panel.add(ClickResult);
        panel.add(list_vegetables);
        panel.add(list_meat);
        panel.add(list_cheeses);
        panel.add(list_fish);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}