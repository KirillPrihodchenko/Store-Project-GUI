package UserInterface;

import StoreLogic.Category;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WindowLogin implements ActionListener{


    private static final JFrame frame = new JFrame("Store 'Beerlander'");
    private static JPanel panel = new JPanel();
    private static JTextField TextFieldForALogin, TextFieldForAPassword;
    private static JLabel LabelBoxForAName, LabelBoxForAPassword;
    private static JButton ButtonForEntranceInStore, ButtonForClearEnterData;

    public void LoginWindow() {

        panel.setPreferredSize(new Dimension(280, 150));

        LabelBoxForAName = new JLabel("Name:");
        LabelBoxForAName.setPreferredSize(new Dimension(260, 50));
        LabelBoxForAName.setFont(new Font("name", Font.ITALIC, 16));
        LabelBoxForAName.setOpaque(true);
        LabelBoxForAPassword = new JLabel("Password:");
        LabelBoxForAPassword.setPreferredSize(new Dimension(260, 40));
        LabelBoxForAPassword.setFont(new Font("pass", Font.ITALIC, 16));
        LabelBoxForAPassword.setOpaque(true);

        TextFieldForALogin = new JTextField();
        TextFieldForALogin.setBounds(90, 20, 150, 30);
        TextFieldForAPassword = new JTextField();
        TextFieldForAPassword.setBounds(90, 65, 150, 30);

        ButtonForEntranceInStore = new JButton("Log In");
        ButtonForEntranceInStore.addActionListener(this);
        ButtonForClearEnterData = new JButton("Clear");

        frame.add(TextFieldForALogin);
        frame.add(TextFieldForAPassword);
        frame.add(panel);
        panel.add(LabelBoxForAName);
        panel.add(LabelBoxForAPassword);
        panel.add(ButtonForEntranceInStore);
        panel.add(ButtonForClearEnterData);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        panel.setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == ButtonForEntranceInStore) {
            WindowStore windowStore = new WindowStore();
            windowStore.PushWindow();
        }
    }
}
