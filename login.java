
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class login  {
	//java fields for password and username box
	private static JLabel userID;
	private static JTextField userText;
	private static JLabel Password;
	private static JPasswordField paswordblank;
	private static JButton Oogin;
	private static JLabel welcome;
	
	public static void main(String[] args) {
		JPanel p = new JPanel();
		JFrame f = new JFrame();
		f.setSize (269, 250) ;//to change the size of the frames
		f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		f.add(p);	
		//
		p.setLayout(null);
		
		userID = new JLabel("User ID");
		userID.setBounds(10, 20, 80, 25);
		p.add(userID);
		//for user id
		userText = new JTextField(20);
		userText.setBounds(100, 20, 165, 25);
		p.add(userText);
	 //creates text box
		Password = new JLabel("Password");// password label
		Password.setBounds(10, 50, 80, 25);
		p.add(Password);
		
		paswordblank = new JPasswordField();// password box for user
		paswordblank.setBounds(100, 50, 165, 25);
		p.add(paswordblank);
		
		
		Oogin = new JButton("login as student");// admin version
		Oogin.setBounds(10, 80, 200,40);
		
		p.add(Oogin);
		
	  welcome = new JLabel("you have logged in");
		welcome.setBounds(10, 130,1000, 25);
		p.add(welcome);
				
				
		f.setVisible(true);
	
	}
}

	