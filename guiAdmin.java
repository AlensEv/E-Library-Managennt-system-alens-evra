import javax.swing.*;  
public class guiAdmin {  
JFrame f;  
guiAdmin(){  
f=new JFrame();//creating instance of JFrame  
     JButton b=new JButton("Click for Admin login");
     //creating  the button

b.setBounds(50,50,150, 50);  
       
f.add(b);//adding button in JFrame  
          
f.setSize(280,200);//400 width and 500 height  
f.setLayout(null); //using no layout managers  
f.setVisible(true); //making the frame visible  
}  
{
}
  public static void main(String[] args) {  
new guiAdmin();  
}  
} 