package or3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import javax.print.attribute.standard.Compression;
import or3.RoundButton;

/**
 *
 * @author Abdalnasf Galal Abda
 */

public class OR {

    private static int comprisions,productss;
    private static int moo;
 OR(int nn,int mm){
        productss=nn;
        comprisions=mm;
        moo=mm;
         }
    OR(){
        productss=3;
        comprisions=4;
        moo=4;
    }
    private static double perioc[]=new double[4];
    private static double periop[][]=new double [4][3];
   
    public static void periorty(){
        final int r=productss;
    final JFrame f=new JFrame();
f.setTitle("The "+(char)('1'+(comprisions-moo))+" Comprision ");    
f.setBounds(550, 250, 70+70*r, 120+30*r);     
f.setVisible(true);
f.setResizable(false);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JPanel p=new JPanel();
p.setBounds(0, 0, 70+70*r, 120+30*r);
p.setLayout(null);
f.add(p);

final JButton b=new JButton("Check");
b.setBounds((30+70*r)/2 ,(50+30*r), 70, 30);
final JButton bb=new JButton("Done");
bb.setBounds((30+70*r)/2 ,(50+30*r), 70, 30);
bb.setVisible(false);
p.add(bb);
p.add(b);

JLabel show[]=new JLabel[r];
for(int x=0;x<r;x++){
    show[x]=new JLabel();
    show[x].setBounds(0,40+30*x,10,10);
    show[x].setText(""+(char)('A'+x));
    p.add(show[x]);
}
JLabel ashow[]=new JLabel[r];    
for(int x=0;x<r;x++){
    ashow[x]=new JLabel();
    ashow[x].setBounds(60+70*x,0,10,10);
    ashow[x].setText(""+(char)('A'+x));
    p.add(ashow[x]);
}

final JTextField t[] =new JTextField[r*r];

int y=0,i=0;    
for(int x=0;x<r*r;x++,y++){
    if(y==r){y=0;i++;}
    
        t[x]=new JTextField();
        t[x].setBounds(30+(y*70), 30+(i*30), 70, 30);
        t[x].setBackground(Color.red);
        p.add(t[x]);
     }
//************************************************** Checking -*******************************************
final double intered[][]=new double[r][r];

b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                int fi=0,sec=0; int flag=0;int nflag=0;
                for(int an=0;an<r*r;an++){
                    String xy;
                    if(sec>=r){sec=0;fi++;}
                   xy=t[an].getText();
                   
                   if(!(xy.matches("\\d+.\\d")||xy.matches("\\d+")||xy.matches(".+\\d"))){
                                        JOptionPane.showMessageDialog(null,"◘◘◘ Error Sir Re Enter ◘◘◘");
                                        flag=1;break;
                   }
                     
                   intered[fi][sec++]= Double.parseDouble(xy);
                         
                 }
                for(int i=0;i<r;i++)
                    for(int x=0;x<r;x++){
                    //    System.out.println(i+""+x+"  "+intered[i][x]);
                        if(intered[i][x]*intered[x][i]!=1||intered[x][x]!=1||intered[i][x]*intered[x][i]!=1||intered[x][x]<=0.99){
                            nflag=1;break;}
                    }
               if(nflag==1&&flag!=1)JOptionPane.showMessageDialog(null,"Erro in number"); 
                
            if(flag==0&&nflag==0) {b.setVisible(false);
            bb.setVisible(true);
            }
            }
        });
//********************************************Calculating**************************************
 final double perio[]=new double[r];

bb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

double geo[]=new double[r];
double sumg=0;
double sum[]=new double [r];
double m;
double fmax=0,ci,cr;
        
for(int mn=0;mn<r;mn++){
     m=1;
for(int x=0;x<r;x++){
m*=intered[mn][x];
sum[x]+=intered[mn][x];
}
geo[mn]=Math.pow(m,1.0/r);
sumg+=geo[mn];
}
for(int mb=0 ;mb<r;mb++){
perio[mb]=geo[mb]/sumg;
fmax+=perio[mb]*sum[mb];
}
ci=(fmax-r)/(r-1);
cr=ci/0.58;
if(cr>.1)  {  System.out.println("Rejected");}
f.dispose();
       periop[comprisions-(moo)]=perio;                 
            if((moo--)>1)
                OR.periorty();
            else OR.perioc();
            }
                                                });
}
    
//♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥ Repeated To Comp ♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥
   private static void perioc(){
final int r=comprisions;

final JFrame f=new JFrame();
f.setBounds(550, 250, 70+70*r, 120+30*r);     
f.setVisible(true);
f.setResizable(false);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setTitle("Final Comprision");
JPanel p=new JPanel();
p.setBounds(0, 0, 70+70*r, 120+30*r);
p.setLayout(null);
f.add(p);

final JButton b=new JButton("Check");
b.setBounds((30+70*r)/2 ,(50+30*r), 70, 30);
final JButton bb=new JButton("Done");
bb.setBounds((30+70*r)/2 ,(50+30*r), 70, 30);
bb.setVisible(false);
p.add(bb);
p.add(b);

JLabel show[]=new JLabel[r];
for(int x=0;x<r;x++){
    show[x]=new JLabel();
    show[x].setBounds(0,40+30*x,10,10);
    show[x].setText(""+(char)('1'+x));
    p.add(show[x]);
}
JLabel ashow[]=new JLabel[r];    
for(int x=0;x<r;x++){
    ashow[x]=new JLabel();
    ashow[x].setBounds(60+70*x,0,10,10);
    ashow[x].setText(""+(char)('1'+x));
    p.add(ashow[x]);
}

final JTextField t[] =new JTextField[r*r];

int y=0,i=0;    
for(int x=0;x<r*r;x++,y++){
    if(y==r){y=0;i++;}
    
        t[x]=new JTextField();
        t[x].setBounds(30+(y*70), 30+(i*30), 70, 30);
        t[x].setBackground(Color.red);
        p.add(t[x]);
     }
//************************************************** Checking -*******************************************
final double intered[][]=new double[r][r];

b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                int fi=0,sec=0; int flag=0;int nflag=0;
                for(int an=0;an<r*r;an++){
                    String xy;
                    if(sec>=r){sec=0;fi++;}
                   xy=t[an].getText();
                   
                   if(!(xy.matches("\\d+.\\d")||xy.matches("\\d+")||xy.matches(".+\\d"))){
                                        JOptionPane.showMessageDialog(null,"◘◘◘ Error Sir Re Enter ◘◘◘");
                                        flag=1;break;
                   }
                     
                   intered[fi][sec++]= Double.parseDouble(xy);
                         
                 }
                for(int i=0;i<r;i++)
                    for(int x=0;x<r;x++){
                    //    System.out.println(i+""+x+"  "+intered[i][x]);
                        if(intered[i][x]*intered[x][i]!=1||intered[x][x]!=1||intered[i][x]*intered[x][i]!=1||intered[x][x]<=0.99){
                            nflag=1;break;}
                    }
               if(nflag==1&&flag!=1)JOptionPane.showMessageDialog(null,"Erro in number"); 
                
            if(flag==0&&nflag==0) {b.setVisible(false);
            bb.setVisible(true);
            }
            }
        });
//********************************************Calculating**************************************
 final double perio[]=new double[r];

bb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

double geo[]=new double[r];
double sumg=0;
double sum[]=new double [r];
double m;
double fmax=0,ci,cr;
        
for(int mn=0;mn<r;mn++){
     m=1;
for(int x=0;x<r;x++){
m*=intered[mn][x];
sum[x]+=intered[mn][x];
}
geo[mn]=Math.pow(m,1.0/r);
sumg+=geo[mn];
}
for(int mb=0 ;mb<r;mb++){
perio[mb]=geo[mb]/sumg;
fmax+=perio[mb]*sum[mb];
}
ci=(fmax-r)/(r-1);
cr=ci/0.58;
if(cr>.1)  {  System.out.println("Rejected");}
  //   for(int ii=0;ii<perio.length;ii++)  System.out.println(perio[ii]);
 //               System.out.println(perio[0]);
f.dispose();
           perioc=perio;
OR.good();
            }
                                                });
}
   
//******************************Good**************************    
private static void good(){
        double[][] p=periop;
        double[] c=perioc;
        double good[]=new double[p[0].length];
              for(int t=0;t<c.length;t++) 
        for(int i=0;i<p[0].length;i++)
             good[i]+=c[t]*p[t][i];
        
        
        
        final JFrame h=new JFrame();
        JPanel pp=new JPanel();
        JLabel al[]=new JLabel[good.length];
        JLabel an[]=new JLabel[good.length];
        JLabel name=new JLabel("The Good Of Products");
        
        
        h.setBounds(550, 250, 200, 70+22*good.length);     
        h.setResizable(false);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        h.setVisible(true);
        h.add(pp);
        
        pp.setLayout(null);
        pp.add(name);
        
        name.setBounds(20, 10, 150, 20);
        name.setForeground(Color.red);
        
        for (int n=0;n<good.length;n++)
        {
            al[n]=new JLabel();
            an[n]=new JLabel();
            pp.add(al[n]);
            pp.add(an[n]);
            
            al[n].setBounds(50, 40+20*n, 50, 10);
            al[n].setText(good[n]+"");
            an[n].setBounds(10, 40+20*n, 50, 10);
            an[n].setForeground(Color.red);
            an[n].setText((char)('A'+n)+"");
        } 
        
    JButton b=new JButton("Exit");
        pp.add(b);
        b.setBounds(120, 20+20*good.length, 60, 22);
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            h.dispose();
            }
        });
      
}  
    


}
