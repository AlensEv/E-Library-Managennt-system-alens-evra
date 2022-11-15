import java.awt.FlowLayout;
 import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;
 // Gui to give option to login as student or admin
public class labels 
extends JFrame {
 
	private static final long serialVersionUID = 731368178853944598L;
	public labels() {
        super("Swing JRadioButton Demo");
 
        JRadioButton option1 = new 
JRadioButton("login as admin");
        JRadioButton option2 = new 
JRadioButton("login as student");
          
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
       
 setLayout(new FlowLayout());
 
        add(option1);
        add(option2);
     
 
        pack();
    }
     public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
 
public void run() {
                new 
labels().setVisible(true);
            }
        });
    }
}