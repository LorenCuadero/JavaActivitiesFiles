import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JButton;
import javax.swing.*;
public class Login{
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Click Here!");
        JLabel jLabel = new JLabel("Username");
        JCheckBox jCheckBox = new JCheckBox("Checkbox");
        setTitle("Login Page");
        setSize(500, 600);
        serDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(300,400));
        jPanel.setLayout(new GridLayout(0, 2));
        jPanel.add(jLabel);
        jPanel.add(jButton);
        jFrame.add(jPanel);
        jPanel.add(jCheckBox);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
