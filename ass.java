import javax.swing.*;
import java.awt.event.*;


 class ass extends JFrame  implements ActionListener
 { JTextField tf1,tf2,tf3,tf4; JLabel l1,l2,l3,l4; JButton b1; void display() {

l1=new JLabel("enter principal");
l1.setBounds(0,00,180,20);
add(l1);
tf1=new JTextField(43);
tf1.setBounds(10,20,190,30);
add(tf1);
tf1.addActionListener(this);

l2=new JLabel("enter rate");
l2.setBounds(10,50,180,20);
add(l2);
tf2=new JTextField(43);
tf2.setBounds(10,70,190,20);
add(tf2);
tf2.addActionListener(this);



l3=new JLabel("enter time");
l3.setBounds(10,90,180,20);
add(l3);
tf3=new JTextField(43);
tf3.setBounds(10,110,190,30);
add(tf3);
tf3.addActionListener(this);



b1=new JButton("calculate");
b1.setBounds(10,150,190,33);
b1.addActionListener(this);
add(b1);


l4=new JLabel("result");
l4.setBounds(10,185,180,20);
add(l4);
tf4=new JTextField(43);
tf4.setBounds(10,205,190,20);
add(tf4);
tf4.addActionListener(this);


setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(null);
setVisible(true);
setSize(300,300);
}
public void actionPerformed(ActionEvent ae)
{
Double x,y,z,o;

x=Double.parseDouble(tf1.getText());
y=Double.parseDouble(tf2.getText());
z=Double.parseDouble(tf3.getText());
if(ae.getActionCommand()=="calculate")
{
o=((x*y*z)/100);
tf4.setText(String.valueOf(o));
}

}
public static void main(String args[])
{
ass a=new ass();
a.display();
}
}
