/* Computer Programming 1
 */
 

import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GuiExample extends JFrame
{

   //class constructor
   public GuiExample (){
      setSize(1600,600);
      setTitle("Sample");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      Toolkit toolkit = getToolkit();
      Dimension size =  toolkit.getScreenSize();
      setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);

   }
	public static void main(String[] args) {
  
      GuiExample simple = new GuiExample();
      //simple.setLayout(null); // caused  the  panel to be hidden
            
      JPanel panel = new JPanel();
      
      simple.getContentPane().add(panel);
      //panel.setLayout(null);
      
      JButton  btn = new JButton("beep");
      btn.setBounds(150,60,80,80);
      panel.add(btn);
      panel.add(new JButton("hi there"));
      btn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent event) {
              //JButton  btn1 = new JButton("hello");
              //btn1.setBounds(200,120,80,80);
              //panel.add(new JButton("hi there"));
         }
       });
      simple.setVisible(true);
      
  }
 }