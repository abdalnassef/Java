package or3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;
import or3.RoundButton;

/**
 *
 * @author Abdalnasf Galal Abda
 */

public class OR3 {
   static JTextField l=new JTextField();
        
  public static void main(String[] args) {
  /*double products[][]={{1,2,2},{2,21,2},{1,2,3}};
  double comprision[]={1,2,5};
  comprision=OR.periorty(3);       
            System.out.println(comprision[0]);
  
          OR.good(products,comprision);
                     
    */    
      /*
       char x='A';
        final JFrame f=new JFrame();
        final RoundButton b1=new RoundButton("Exit");
        final RoundButton fb=new RoundButton(""+x);
      
        l.setText("aa");
        l.setText("aaaa");
        
        b1.addActionListener(new ActionListener() {
            @Override
            
            public void actionPerformed(ActionEvent e) {
        
            l.setText("aaa");
                f.dispose();
            }
        });
         System.out.println(l.getText());
        final int c=Integer.parseInt(JOptionPane.showInputDialog("Enter The number of compriosn"));
        int r=Integer.parseInt(JOptionPane.showInputDialog("Enter The number of Products"));
        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.add(b1);
         if (c%2==1){
             f.add(fb);
             fb.setBounds(c*11+10, 25, 50, 20);
             fb.setVisible(false);
         }
         final RoundButton gb[]=new RoundButton[c/2] ;
         final RoundButton gb2[]=new RoundButton[c/2] ;
         for(int i=0;i<c/2;i++){
             gb[i]=new RoundButton((""+(char)(x+=1)));
         gb[i].setBounds(12*c-20-20*i, 80+20*i, 50, 20);
         f.add(gb[i]);
         gb[i].setName(null);
                 gb2[i]=new RoundButton(""+(char)(x+=1));
         gb2[i].setBounds(12*c+35+20*i, 80+20*i, 50, 20);
         f.add(gb2[i]);
         }
         
         a:
        b1.setBounds(c*11, 50, 70, 30);
        f.setBounds(500, 200, 50+c/2*65, 100+c/2*50);
        if(c>0)    fb.setVisible(true);
       
  */
      int comp,prod,flag=0;String y,x;
 do{
       x=JOptionPane.showInputDialog("Enter The number of comprision");
      if(!(x.matches("\\d"))){
          JOptionPane.showMessageDialog(null,"number of comprision only integer numbers Sir");
      flag=1;
      }
 }while(flag==1);
      do{     
      y=JOptionPane.showInputDialog("Enter The number of products");
 if(!(y.matches("\\d"))){
          JOptionPane.showMessageDialog(null,"number of Products only integer Sir");
 flag=1;     
 }
 }while(flag==1);
if((y.matches("\\d"))&&(x.matches("\\d"))){
             comp=Integer.parseInt(x);
       prod=Integer.parseInt(y);
      
      OR c=new OR(prod,comp);
      c.periorty();
}
   }
}
