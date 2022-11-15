
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class loginadmin  {
	private static JLabel userID;
	private static JTextField userText;
	private static JLabel Password;
	private static JPasswordField paswordblank;
	private static JButton Oogin;
	private static JLabel welcome;
	// same field different bounds from student
	public static void main(String[] args) {
		JPanel p = new JPanel();
		JFrame f = new JFrame();
		f.setSize (269, 250) ;
		f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		f.add(p);	
		
		p.setLayout(null);
		
		userID = new JLabel("User ID");
		userID.setBounds(10, 20, 80, 25);
		p.add(userID);
		
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		p.add(userText);
	
		Password = new JLabel("Password");
		Password.setBounds(10, 50, 80, 25);
		p.add(Password);
		
		paswordblank = new JPasswordField();
		paswordblank.setBounds(100, 50, 165, 25);
		p.add(paswordblank);
		
		//admin logins
		Oogin = new JButton("login as admin");
		Oogin.setBounds(10, 80, 200,40);
		
		p.add(Oogin);
		// log ins for admin welcome message
	  welcome = new JLabel("login succeessfull");
		welcome.setBounds(10, 150,1000, 25);
		p.add(welcome);
				
				
		f.setVisible(true);
	
	}
}

	