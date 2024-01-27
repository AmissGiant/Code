import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener{
    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;
    public GUI(){
        frame = new JFrame();
        JButton button = new JButton("Click");
        button.addActionListener(this);
        panel = new JPanel();
        label = new JLabel("Total Clicks");
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My GUI");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args){
        new GUI();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    count++;
    label.setText("Total Clicks :" + count);
    }
}