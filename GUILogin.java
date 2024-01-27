import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUILogin implements ActionListener {
    private static JLabel Userlabel;
    private static JTextField userText;
    private static JLabel Passlabel;
    private static JPasswordField passText;
    private static JButton button;
    private static JLabel succ;
    public static void main(String[] args){
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        Userlabel = new JLabel("User");
        Userlabel.setBounds(10, 20, 80, 25);
        panel.add(Userlabel);
        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
        Passlabel = new JLabel("Password");
        Passlabel.setBounds(10, 50, 80, 25);
        panel.add(Passlabel);
        passText = new JPasswordField(20);
        passText.setBounds(100, 50, 165, 25);
        panel.add(passText);
        button = new JButton("Enter");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUILogin());
        panel.add(button);
        succ = new JLabel("");
        succ.setBounds(10, 110, 300, 25);
        panel.add(succ);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passText.getText();
        if(user.equals("Alex") && password.equals("Violet")){
            succ.setText("Login Successful!");
        }else{
            succ.setText("Fuck no");
        }
        }
}
