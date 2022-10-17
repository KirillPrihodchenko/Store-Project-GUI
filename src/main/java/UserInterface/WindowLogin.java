package UserInterface;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;


public class WindowLogin extends DataForLogin implements ActionListener {

    private static final JFrame frame = new JFrame("Grocery Store");
    private static final JPanel panel = new JPanel();
    private static JTextField TextFieldForALogin;
    private static JPasswordField TextFieldForAPassword;
    private static JLabel LabelBoxForAName, LabelBoxForAPassword;
    private static JButton ButtonForEntranceInStore, ButtonForClearEnterData;

    public WindowLogin(HashMap<String, String> loginInfo) {

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
        TextFieldForAPassword = new JPasswordField();
        TextFieldForAPassword.setBounds(90, 65, 150, 30);


        if (TextFieldForALogin == null && TextFieldForAPassword == null) {

            throw new NullPointerException();
        }

        ButtonForEntranceInStore = new JButton("Log In");
        ButtonForEntranceInStore.addActionListener(this);
        ButtonForEntranceInStore.setFocusable(false);
        ButtonForClearEnterData = new JButton("Clear");
        ButtonForClearEnterData.addActionListener(this);
        ButtonForClearEnterData.setFocusable(false);

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

        if (e.getSource() == ButtonForClearEnterData) {
            TextFieldForALogin.setText("");
            TextFieldForAPassword.setText("");
        }
        if (e.getSource() == ButtonForEntranceInStore) {

            String name = TextFieldForALogin.getText();
            String password = String.valueOf(TextFieldForAPassword.getPassword());

            if (getLoginInfo().containsKey(name)) {
                if (getLoginInfo().get(name).equals(password)) {
                    new WindowStore();
                }
            }
        }
    }
}
