/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id3.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author AGA
 */
public class ID33 {
    private static int base=2;
    private static String Table[][]={
    {"sunny"    ,"hot"  ,"high"   ,"weak"   ,"no"  },
    {"sunny"    ,"hot"  ,"high"   ,"strong" ,"no"  },
    {"overcast" ,"hot"  ,"high"   ,"weak"   ,"yes" },
    {"rain"     ,"mild" ,"high"   ,"weak"   ,"yes" },
    {"rain"     ,"cool" ,"normal" ,"weak"   ,"yes" },
    {"rain"     ,"cool" ,"normal" ,"strong" ,"no"  },
    {"overcast" ,"cool" ,"normal" ,"strong" ,"yes" },
    {"sunny"    ,"mild" ,"high"   ,"weak"   ,"no"  },
    {"sunny"    ,"cool" ,"normal" ,"weak"   ,"yes" },
    {"rain"     ,"mild" ,"normal" ,"weak"   ,"yes" },
    {"sunny"    ,"mild" ,"normal" ,"strong" ,"yes" },
    {"overcast" ,"mild" ,"high"   ,"strong" ,"yes" },
    {"overcast" ,"hot"  ,"normal" ,"weak"   ,"yes" },
    {"rain"     ,"mild" ,"high"   ,"strong" ,"no"  }
};
            private static String  Allstr[]={"Outlook","Temperature","Humidity","Wind"};
           private static String  All[][]={{"sunny","overcast","rain"},{"hot","mild","cool"},{"high","normal"},{"weak","strong"}};
      
           public static double Entropy(int positive,int negative){
        int sum=positive+negative;
        //عشان بنستخدم صح وغلط بس فالقاعدة اتنين
        double P_pos=(double)positive/sum;
        double P_neg=(double)negative/sum;
        double E_result=P_pos*mylog(P_pos)+P_neg*mylog(P_neg);
        E_result*=-1;
        if(Double.isNaN(E_result))E_result=0;
        return E_result;
       }
          public static double mylog(double number){
        double result;
        result = Math.log(number)/Math.log(base);
        return result;
         }
           
           public static int[][] T_F(int index,int[][] rows){
               int name[][]=new int[All[index].length][2];
               for(int i=0;i<rows.length;i++){
                   for(int in=0;in<rows[i].length;in++){
                    if(Table[rows[i][in]][Table[rows[i][in]].length-1].equals("yes")){
                          for(int x=0;x<name.length;x++)
                           if(All[index][x].equals(Table[rows[i][in]][index]))
                               name[x][0]+=1;
                       
                   }else{
                       for(int x=0;x<name.length;x++)
                           if(All[index][x].equals(Table[rows[i][in]][index]))
                               name[x][1]+=1;
                   }
                   }
               }
                    return name;
           }
           public static int[][] T_F(int index,int[] rows){
               int[][] T = new int[All[index].length][2];
               for(int n=0;n<All[index].length;n++){
                  for(int i=0;i<rows.length;i++){
                   if(Table[rows[i]][index].equals(All[index][n])&&Table[rows[i]][Table[rows[i]].length-1].equals("yes"))T[n][0]+=1;
                   else if(Table[rows[i]][index].equals(All[index][n])&&Table[rows[i]][Table[rows[i]].length-1].equals("no"))T[n][1]+=1;
               } 
               }
               
                    return T;
           }
          
           public static int[][] myintable(String[] name,int index){
    ArrayList<Integer> ea=new ArrayList<>();
    int [][]eachindex = new int[name.length][];
    
    for(int x=0;x<name.length;x++){
    for(int i=0;i<Table.length;i++)
        if(Table[i][index].equals(name[x]))ea.add(i);
    int[] each=new int[ea.size()];
    for(int i=0;i<ea.size();i++){
        each[i]=ea.get(i);
    }
    eachindex[x]=each;
    ea.removeAll(ea);
   
    }
    return eachindex;
 }
           public static void main(String[] args) {
               double max=-1;int ind=-1;
        for(int index=0;index<Allstr.length;index++){
        int[][] x=T_F(index,myintable(All[index], index));
        int lengt=0;
        for(int i=0;i<x.length;i++)lengt+=x[i][0]+x[i][1];
//               System.out.println(lengt);
               double sum=0;
        for(int i=0;i<x.length;i++){
//            System.out.println("|Si|/|S| = "+((double)(x[i][0]+ x[i][1])/lengt));
//            System.out.println("Entropy of "+All[index][i]+" = " +Entropy(x[i][0], x[i][1]));
            sum+=((double)(x[i][0]+ x[i][1])/lengt)*Entropy(x[i][0], x[i][1]);
//            System.out.println("Sum of past "+(i+1)+" Elements "+sum);
        }
        double EforAll=Entropy(T_F()[0],T_F()[1]);
        
               System.out.println("Gain S, "+Allstr[index]+" "+(EforAll-sum));
               if((EforAll-sum)>max){max=EforAll-sum;ind=index;}
        }
               System.out.println("\nMAX is "+max+ " in "+Allstr[ind]);
               int[][] x=myintable(All[ind], ind);
                
               int p=0,n=0,in=-1;String don="";
//               for(int u=0;u<x[0].length;u++)System.out.print(x[0][u]+" ");
               System.out.println("");
               for(int q=0;q<All[ind].length;q++){
                    System.out.println("\t\t\t\t\t\t\""+All[ind][q]+"\"");
                    max=-1;int done=0;
                  for(int w=1;w<Table[ind].length-1;w++){
                       int [][]y=T_F(w, x[q]);
                    double sum=0;int indexx=-1;double max2=-1;
                       System.out.println("*******  "+Allstr[w]+"  ********");
              
                       int s=0;
                       if(done<y.length)done=0;
                       for(int jj=0;jj<y.length;jj++){s+=y[jj][1]+y[jj][0];p+=y[jj][0];n+=y[jj][1];}
                               for(int j=0;j<y.length;j++){
                       System.out.print(All[w][j] +" "+y[j][0]+" "+y[j][1]);
                   
                   if(y[j][0]==0){System.out.print("  This pranch finished and always NO");done++;}
                  else if(y[j][1]==0){System.out.print("  This pranch finished and always YES");done++;}
                    sum+=((double)(y[j][0]+y[j][1])/s)*Entropy(y[j][0],y[j][1]);
                           if(done>=y.length){don=" and Finished ";}
                           else{
                               don="";
                           }
//               }
                    System.out.println("");}
                       System.out.println((Entropy(p, n)-sum)+"**************");
                       if(max<((double)Entropy(p, n)-sum)){
                           max=Entropy(p, n)-sum;
                           in=w;
                           
                       }
                       
                   }
                   System.out.println("The Max in "+All[ind][q]+" is "+max+" in \""+ Allstr[in]+"\""+don);
                   
               }
        
    }
            
           public static int[] T_F(){
               int[] T_F=new int [2];
               for(int i=0;i<Table.length;i++){
                   if(Table[i][Table[i].length-1]=="yes")T_F[0]+=1;
                   else T_F[1]+=1;
               }
               return T_F;
           }
                   
}




    