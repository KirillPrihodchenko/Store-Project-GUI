package UserInterface;

import StoreLogic.Category;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowStore extends Category {

    private static final JFrame frame = new JFrame("Inner store");
    private static final JPanel panel = new JPanel();
    private static JButton okClick;
    //private static JLabel ClickResult;

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
        //ClickResult = new JLabel();

        okClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {

                /* getting multiple elements */

//                int[] selectedIndices = list_vegetables.getSelectedIndices();
//                List<String> complex = new ArrayList<>();
//                for (int i = 0; i < selectedIndices.length; i++) {
//                    myArray[i] =  String.valueOf(list_vegetables.getModel().getElementAt(selectedIndices[i]));
//                }
//
//                String myString = String.valueOf(list_vegetables.getSelectedValue());

                try {

                    var val = Double.parseDouble(vegetables.get(list_vegetables.getSelectedValue().trim()));

                    if (event.getSource() == okClick) {

                        System.out.println(val);
                    }
                }
                catch (NumberFormatException ex) {

                    ex.getStackTrace();
                }
            }
        });

        frame.add(panel);
        panel.add(okClick);
      //panel.add(ClickResult);
        panel.add(list_vegetables);
        panel.add(list_meat);
        panel.add(list_cheeses);
        panel.add(list_fish);
        frame.pack();
        frame.setVisible(true);
    }
}