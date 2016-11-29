/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package or2;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Abdalnasf Galal Abda
 */
public class OR2 {
   
    
    static double[] inter(int rr){
     int r=rr,c=rr;
     
        Scanner cin=new Scanner(System.in);
     double a[][]=new double[r][c];
     double geo[]=new double[r];
     double sumg=0;
     double sum[]=new double [r];
     double m=1;
     double perio[]=new double[r];
     double fmax=0,ci=0,cr=0;
     
     for(int i=0;i<rr;i++)
             for(int x=0;x<rr;x++){
    if(i>x)        {a[i][x]=1.0/a[x][i];continue;}
	else if(i==x)    a[i][x]=1.0;
	else if(x>i){
	       System.out.println("Enter The ["+(i+1)+"]["+(x+1)+"]=");
	a[i][x]=cin.nextDouble();
        }
                        }
   
for(int i=0;i<rr;i++){
     m=1;
for(int x=0;x<rr;x++){
m*=a[i][x];
sum[x]+=a[i][x];
}
geo[i]=Math.pow(m,1.0/r);
sumg+=geo[i];
}
for(int i=0 ;i<r;i++){
perio[i]=geo[i]/sumg;
fmax+=perio[i]*sum[i];
}
        System.out.println("");
ci=(fmax-r)/(r-1);
double aaa[]={0,0,0.58,0.9,1.12,1.24,1.32,1.41,1.45};
double bi = 0;
for(int i=0;i<aaa.length;i++){
if((i+1)==r){
    bi=aaa[i];
}
}
cr=ci/bi;
if(cr>.1)  {  System.out.println("Rejected");}
 
    return perio;
    }

   
    
    public static void main(String[] args) {
        int nprod,ncomp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number of Products : ");
        nprod=s.nextInt();
        System.out.println("Enter The number of comprision on the products Without Big Table : ");
        ncomp=s.nextInt();
        
        double good[]=new double[nprod];
        for(int u=0;u<nprod;u++)good[u]=0;
        double pe[]=new double[nprod];
        double periop[][]=new double [ncomp][nprod];
        double perioc[]=new double[nprod];
        
        System.out.println("Big Tabel");
        perioc=inter(ncomp);
        
        for(int xx=0;xx<ncomp;xx++){
            System.out.println("The  "+(xx+1)+" Tabel ");
            pe=inter(nprod);
            periop[xx]=pe;    
        }
        for(int i=0;i<ncomp;i++){
         for(int x=0;x<nprod;x++){
         good[x]+=periop[i][x]*perioc[i];
         }
        }
        double max=good[0];int number=0;
        for(int i=0;i<nprod;i++){
            System.out.println((i+1)+" = "+good[i]);
        if(max<good[i]){max=good[i];number=i;}
        }
        System.out.println("The Best Choice is "+max+" And It is The Product Nnumber "+(number+1));
    
     
    }
}
