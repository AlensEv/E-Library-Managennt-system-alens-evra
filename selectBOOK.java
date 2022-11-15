import javax.swing.*;    
//Gui to allow user to select their first second... 4th book
public class selectBOOK {    
JFrame f;    
selectBOOK(){    
    f=new JFrame("select listed book");    
    String Book[]={"Book 1, ","Book 2" ,"Book 3" ,"Book 4"};
    JComboBox cb=new JComboBox(Book);    
    cb.setBounds(50,50,90,20);    
    f.add(cb);        
    f.setLayout(null);    
    f.setSize(200,150);    
    f.setVisible(true);        
}    
public static void main(String[] args) {    
 new selectBOOK();   

}   
} 
