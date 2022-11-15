import javax.swing.*;  
public class gui {  
JFrame f;  
gui(){  
f=new JFrame();//creating  JFrame  
     JButton b=new JButton("Click for student login");
     //creating  the button
b.setBounds(50,50,170, 50);  
       //button dimensions for student 50,50,170, 50
f.add(b);//adding button in JFrame  
          
f.setSize(280,200);//280 width and 200 height  
f.setLayout(null);  
f.setVisible(true); //makes the frame visible  
}  
{
}
  public static void main(String[] args) {  
new gui();  
}  
} 