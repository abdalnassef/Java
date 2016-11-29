/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static security.Security.Litter;

/**
 *
 * @author AGA
 */
class inside implements Runnable {
String L1;
    public inside(String L1) {
        this.L1=L1;
    }
 public void run() {
 String pass="";
        for (int L2=0;L2<9;L2++){
         insidein M=new insidein(L1,L2) ;
         M.run();
        }
 }
 }
class insidex implements Runnable {
String L1;
    public insidex(String L1) {
        this.L1=L1;
    }
 public void run() {
 String pass="";
        for (int L2=9;L2<18;L2++){
         insidein M=new insidein(L1,L2) ;
         M.run();
        }
 }
 }
class insidexx implements Runnable {
String L1;
    public insidexx(String L1) {
        this.L1=L1;
    }
 public void run() {
 String pass="";
        for (int L2=Litter.length-1;L2>=18;L2--){
         insidein M=new insidein(L1,L2) ;
         M.run();
        }
 }
 }
//********************************************************************
class inside0 implements Runnable {
String L1;
    public inside0(String L1) {
        this.L1=L1;
    }
 public void run() {
 String pass="";
        for (int L2=0;L2<Litter.length/13;L2++){
         insidein M=new insidein(L1,L2) ;
         M.run();
        }
 }
 }
class inside1 implements Runnable {
String L1;
    public inside1(String L1) {
        this.L1=L1;
    }
 public void run() {
 String pass="";
        for (int L2=Litter.length/13;L2<(Litter.length/13)*2;L2++){
         insidein M=new insidein(L1,L2) ;
         M.run();
        }
 }
 }

class inside2 implements Runnable {
String L1;
    public inside2(String L1) {
        this.L1=L1;
    }
 public void run() {
 String pass="";
        for (int L2=(Litter.length/13)*2;L2<(Litter.length/13)*3;L2++){
         insidein M=new insidein(L1,L2) ;
         M.run();
        }
 }
 }

class inside3 implements Runnable {
String L1;
    public inside3(String L1) {
        this.L1=L1;
    }
 public void run() {
 String pass="";
        for (int L2=(Litter.length/13)*3;L2<(Litter.length/13)*4;L2++){
         insidein M=new insidein(L1,L2) ;
         M.run();
        }
 }
 }

class inside4 implements Runnable {
String L1;
    public inside4(String L1) {
        this.L1=L1;
    }
 public void run() {
 String pass="";
        for (int L2=(Litter.length/13)*4;L2<(Litter.length/13)*5;L2++){
         insidein M=new insidein(L1,L2) ;
         M.run();
        }
 }
 }

class inside5 implements Runnable {
String L1;
    public inside5(String L1) {
        this.L1=L1;
    }
 public void run() {
 String pass="";
        for (int L2=(Litter.length/13)*5;L2<(Litter.length/13)*6;L2++){
         insidein M=new insidein(L1,L2) ;
         M.run();
        }
 }
 }

class inside6 implements Runnable {
String L1;
    public inside6(String L1) {
        this.L1=L1;
    }
 public void run() {
 String pass="";
        for (int L2=(Litter.length/13)*6;L2<(Litter.length/13)*7;L2++){
         insidein M=new insidein(L1,L2) ;
         M.run();
        }
 }
 }

class inside7 implements Runnable {
String L1;
    public inside7(String L1) {
        this.L1=L1;
    }
 public void run() {
 String pass="";
        for (int L2=(Litter.length/13)*7;L2<(Litter.length/13)*8;L2++){
         insidein M=new insidein(L1,L2) ;
         M.run();
        }
 }
 }

class inside8 implements Runnable {
String L1;
    public inside8(String L1) {
        this.L1=L1;
    }
 public void run() {
 String pass="";
        for (int L2=(Litter.length/13)*8;L2<(Litter.length/13)*9;L2++){
         insidein M=new insidein(L1,L2) ;
         M.run();
        }
 }
 }

class inside9 implements Runnable {
String L1;
    public inside9(String L1) {
        this.L1=L1;
    }
 public void run() {
 String pass="";
        for (int L2=(Litter.length/13)*9;L2<(Litter.length/13)*10;L2++){
         insidein M=new insidein(L1,L2) ;
         M.run();
        }
 }
 }

class inside10 implements Runnable {
String L1;
    public inside10(String L1) {
        this.L1=L1;
    }
 public void run() {
 String pass="";
        for (int L2=(Litter.length/13)*10;L2<(Litter.length/13)*11;L2++){
         insidein M=new insidein(L1,L2) ;
         M.run();
        }
 }
 }
class inside11 implements Runnable {
String L1;
    public inside11(String L1) {
        this.L1=L1;
    }
 public void run() {
 String pass="";
        for (int L2=(Litter.length/13)*11;L2<(Litter.length/13)*12;L2++){
         insidein M=new insidein(L1,L2) ;
         M.run();
        }
 }
 }
class inside12 implements Runnable {
String L1;
    public inside12(String L1) {
        this.L1=L1;
    }
 public void run() {
 String pass="";
        for (int L2=(Litter.length/13)*12;L2<Litter.length;L2++){
         insidein M=new insidein(L1,L2) ;
         M.run();
        }
 }
 }

//*************************************************************************************************************

class insidein implements Runnable {
String L1;int L2;
    public insidein(String L1,int L2) {
        this.L1=L1;
        this.L2=L2;
    }
 public void run() {
 String pass="";
        for (int L3=0;L3<Litter.length;L3++){
            insideinin M=new insideinin(L1,L2,L3) ;
            M.run();
        }
 }
 }
class insideinin implements Runnable {
String L1;int L2;int L3;
    public insideinin(String L1,int L2,int L3) {
        this.L1=L1;
        this.L2=L2;
        this.L3=L3;
    }
 public void run() {
        for (int L4=0;L4<Litter.length;L4++){
            insideininin M=new insideininin(L1,L2,L3,L4) ;
            M.run();
        }
 }
 }
class insideininin implements Runnable {
String L1;int L2;int L3;int L4;
    public insideininin(String L1,int L2,int L3,int L4) {
        this.L1=L1;this.L2=L2;this.L3=L3;this.L4=L4;
    }
 public void run() {
        for (int L5=0;L5<Litter.length;L5++){
            insideinininin M=new insideinininin(L1,L2,L3,L4,L5) ;
            M.run();
        }
 }
 }
class insideinininin implements Runnable {
String L1;int L2;int L3;int L4;int L5;
    public insideinininin(String L1,int L2,int L3,int L4,int L5) {
        this.L1=L1;this.L2=L2;this.L3=L3;this.L4=L4;this.L5=L5;
    }
 public void run() {
        for (int L6=0;L6<Litter.length;L6++){
            insideininininin M=new insideininininin(L1,L2,L3,L4,L5,L6) ;
            M.run();
        }
 }
 }
class insideininininin implements Runnable {
    
String L1;int L2;int L3;int L4;int L5;int L6;
    public insideininininin(String L1,int L2,int L3,int L4,int L5,int L6) {
        this.L1=L1;this.L2=L2;this.L3=L3;this.L4=L4;this.L5=L5;this.L6=L6;
    }
 public void run() {
        for (int L7=0;L7<Litter.length;L7++){
          if(L1.equals(""+Litter[L2]+""+Litter[L3]+""+Litter[L4]+""+Litter[L5]+""+Litter[L6]+""+Litter[L7])){
              System.out.println("The Password is : "+L1);
                                                                    System.exit(-1);}
        }
        
 }
 }

public class Threadd {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    
        
//    for(int i=0;i<26;i++){
     Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/t","root","root");
        com.mysql.jdbc.Statement stmt=(com.mysql.jdbc.Statement) connection.createStatement();
        // ResultSet rset=stmt.executeQuery("select cardnumber from info where email='"+mail+"'");
        String pass="";
     String username="lll";
     String sql = "select name,pass from pass where name ='"+username+"'";
     String namee,password = "aaaaaa";
     
           ResultSet result=stmt.executeQuery(sql);
             while(result.next()){
                 namee=result.getString("name");
                 if(namee.equals(username)){password=result.getString(2); 
        }
             }
              new Security();
       
              Runnable print = new inside(password);
              Runnable printx = new insidex(password);
              Runnable printxx = new insidexx(password);
       
              Thread thread = new Thread(print);
              Thread threadx = new Thread(printx);
              Thread threadxx = new Thread(printxx);
       
              thread.start(); 
              threadx.start(); 
              threadxx.start(); 
       
         /*     
       Runnable print0 = new inside0(password);
       Runnable print1 = new inside1(password);
       Runnable print2 = new inside2(password);
       Runnable print3 = new inside3(password);
       Runnable print4 = new inside4(password);
       Runnable print5 = new inside5(password);
       Runnable print6 = new inside6(password);
       Runnable print7 = new inside7(password);
       Runnable print8 = new inside8(password);
       Runnable print9 = new inside9(password);
       Runnable print10 = new inside10(password);
       Runnable print11 = new inside11(password);
       Runnable print12 = new inside12(password);
       Thread thread0 = new Thread(print0);
       Thread thread1 = new Thread(print1);
       Thread thread2 = new Thread(print2);
       Thread thread3 = new Thread(print3);
       Thread thread4 = new Thread(print4);
       Thread thread5 = new Thread(print5);
       Thread thread6 = new Thread(print6);
       Thread thread7 = new Thread(print7);
       Thread thread8 = new Thread(print8);
       Thread thread9 = new Thread(print9);
       Thread thread10 = new Thread(print10);
       Thread thread11 = new Thread(print11);
       Thread thread12 = new Thread(print12);
       thread0.start(); 
       thread12.start(); 
       thread1.start(); 
       thread2.start(); 
       thread3.start(); 
       thread11.start(); 
       thread4.start(); 
       thread10.start(); 
       thread5.start(); 
       thread9.start(); 
       thread6.start(); 
       thread7.start(); 
       thread8.start(); 
       thread9.start(); 
       */
       
//              for (int L1=0;L1<Litter.length;L1++){
//        for (int L2=0;L2<Litter.length;L2++){
//        for (int L3=0;L3<Litter.length;L3++){
//        for (int L4=0;L4<Litter.length;L4++){
//        for (int L5=0;L5<Litter.length;L5++){
//        for (int L6=0;L6<Litter.length;L6++){
//            if(password.equals(""+Litter[L1]+""+Litter[L2]+""+Litter[L3]+""+Litter[L4]+""+Litter[L5]+""+Litter[L6])){
//              System.out.println("The Password is : "+""+Litter[L1]+""+Litter[L2]+""+Litter[L3]+""+Litter[L4]+""+Litter[L5]+""+Litter[L6]);
//                                                                    System.exit(-1);}
//      
//      }
//        }
//      }
//       }
//        }
//              }
            
//    }
       
//       Runnable print1 = new P0();
//       Thread thread1 = new Thread(print1);
//       thread1.start();
//       
//       Runnable print2 = new P1();
//       Thread thread2 = new Thread(print2);
//       thread2.start();
//       
//       Runnable print3 = new P2();
//       Thread thread3 = new Thread(print3);
//       thread3.start();
//       
//       Runnable print4 = new P3();
//       Thread thread4 = new Thread(print4);
//       thread4.start();
//       
//       Runnable print5 = new P4();
//       Thread thread5 = new Thread(print5);
//       thread5.start();
//       
//       Runnable print6 = new P5();
//       Thread thread6 = new Thread(print6);
//       thread6.start();
//       
//       Runnable print7 = new P6();
//       Thread thread7 = new Thread(print7);
//       thread7.start();
//       
//       Runnable print8 = new P7();
//       Thread thread8 = new Thread(print8);
//       thread8.start();
//       
//       Runnable print9 = new P8();
//       Thread thread9 = new Thread(print9);
//       thread9.start();
//       
//       Runnable print10 = new P9();
//       Thread thread10 = new Thread(print10);
//       thread10.start();
//       
//       Runnable print11 = new P10();
//       Thread thread11 = new Thread(print11);
//       thread11.start();
//       
//       Runnable print12 = new P11();
//       Thread thread12 = new Thread(print12);
//       thread12.start();
//       
//       Runnable print13 = new P12();
//       Thread thread13 = new Thread(print13);
//       thread13.start();
//       
//       Runnable print14 = new P13();
//       Thread thread14 = new Thread(print14);
//       thread14.start();
//       
//       Runnable print15 = new P14();
//       Thread thread15 = new Thread(print15);
//       thread15.start();
//       
//       Runnable print16 = new P15();
//       Thread thread16 = new Thread(print16);
//       thread16.start();
//       
//       Runnable print17 = new P16();
//       Thread thread17 = new Thread(print17);
//       thread17.start();
//       
//       Runnable print18 = new P17();
//       Thread thread18 = new Thread(print18);
//       thread18.start();
//       
//       Runnable print19 = new P18();
//       Thread thread19 = new Thread(print19);
//       thread19.start();
//       
//       Runnable print20 = new P19();
//       Thread thread20 = new Thread(print20);
//       thread20.start();
//       
//       Runnable print21 = new P20();
//       Thread thread21 = new Thread(print21);
//       thread21.start();
//       
//       Runnable print22 = new P21();
//       Thread thread22=  new Thread(print22);
//       thread22.start();
//       
//       Runnable print23 = new P22();
//       Thread thread23 = new Thread(print23);
//       thread23.start();
//       
//       Runnable print24 = new P23();
//       Thread thread24 = new Thread(print24);
//       thread24.start();
//       
//       Runnable print25 = new P24();
//       Thread thread25 = new Thread(print25);
//       thread25.start();
//       
//       Runnable print26 = new P25();
//       Thread thread26 = new Thread(print26);
//       thread26.start();
//       
//       
       
    
   
    
//    each3char();
    
    
 }
             
 
public static String each3char(){
 Runnable printa = new PrintChar();
       Thread thread1 = new Thread(printa);
       thread1.start();
    Runnable printz = new PrintChar2();
       Thread thread2 = new Thread(printz);
       thread2.start();
    Runnable printz1 = new PrintChar3();
       Thread thread3 = new Thread(printz1);
       thread3.start();
    
       Runnable print4 = new PrintChar4();
       Thread thread4 = new Thread(print4);
       thread4.start();
    
       Runnable print5 = new PrintChar5();
       Thread thread5 = new Thread(print5);
       thread5.start();
    
//       Runnable print6 = new PrintChar6();
//       Thread thread6 = new Thread(print6);
//       thread6.start();
//       
//       Runnable print7 = new PrintChar7();
//       Thread thread7 = new Thread(print7);
//       thread7.start();
       
       return "";
    
}
}


 // *******************************************************************************

class PrintCharwithin implements Runnable {
int L1;
    public PrintCharwithin(int L1) {
        this.L1=L1;
    }
 
 public void run() {
     
 String pass="";
        int x=0;
        for(int L=L1;L<L1+2;L++){
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
        for (int L4=0;L4<Litter.length;L4++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
        }
        }
       
        }
 }
 }


////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 class PrintChar implements Runnable {
 public void run() {  
 String pass="";
        int x=0;
        for (int L1=0;L1<Litter.length/5;L1++){
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
        for (int L4=0;L4<Litter.length;L4++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
        }     
        }
        }
 }
 }

class PrintChar2 implements Runnable {
 public void run() {
     String pass="";
        int x=0;
        for (int L1=Litter.length/5;L1<(Litter.length/5)*2;L1++){
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
        for (int L4=0;L4<Litter.length;L4++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       }
        }
        }
 }
}
        class PrintChar3 implements Runnable {
           
                    public void run() {
     String pass="";
        int x=0;
        for (int L1=(Litter.length/5)*2;L1<(Litter.length/5)*3;L1++){
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
        for (int L4=0;L4<Litter.length;L4++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
        }
       }
        }
                    }
        }
        class PrintChar4 implements Runnable {
                    public void run() {
     String pass="";
        int x=0;
        for (int L1=(Litter.length/5)*3;L1<(Litter.length/5)*4;L1++){
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
        for (int L4=0;L4<Litter.length;L4++){
           pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       }
        }
        }}}
        class PrintChar5 implements Runnable {
                    public void run() {
     String pass="";
        int x=0;
        for (int L1=(Litter.length/5)*4;L1<(Litter.length/5)*5;L1++){
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
        for (int L4=0;L4<Litter.length;L4++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       }
        }
        }
                    }}
//        class PrintChar6 implements Runnable {
//                    public void run() {
//     String pass="";
//        int x=0;
//        for (int L1=(Litter.length/6)*5;L1<(Litter.length/7)*6;L1++){
//        for (int L2=0;L2<Litter.length;L2++){
//        for (int L3=0;L3<Litter.length;L3++){
//        for (int L4=0;L4<Litter.length;L4++){
//            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
//             System.out.println(pass);
//      }
//       }
//        }}}
//        }

// class PrintChar7 implements Runnable {
//                    public void run() {
//     String pass="";
//        int x=0;
//        for (int L1=(Litter.length/7)*6;L1<Litter.length;L1++){
//        for (int L2=0;L2<Litter.length;L2++){
//        for (int L3=0;L3<Litter.length;L3++){
//        for (int L4=0;L4<Litter.length;L4++){
//           pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
//             System.out.println(pass);
//      }
//       }
//        }
//        }}}


































//####################################################################################
 class P0 implements Runnable {
     int L1=0;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P1 implements Runnable {
     int L1=1;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P2 implements Runnable {
     int L1=2;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P3 implements Runnable {
     int L1=3;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P4 implements Runnable {
     int L1=4;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P5 implements Runnable {
     int L1=5;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P6 implements Runnable {
     int L1=6;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P7 implements Runnable {
     int L1=7;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P8 implements Runnable {
     int L1=8;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P9 implements Runnable {
     int L1=9;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P10 implements Runnable {
     int L1=10;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P11 implements Runnable {
     int L1=11;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P12 implements Runnable {
     int L1=12;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P13 implements Runnable {
     int L1=13;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P14 implements Runnable {
     int L1=14;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P15 implements Runnable {
     int L1=15;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P16 implements Runnable {
     int L1=16;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P17 implements Runnable {
     int L1=17;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P18 implements Runnable {
     int L1=18;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P19 implements Runnable {
     int L1=19;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P20 implements Runnable {
     int L1=20;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P21 implements Runnable {
     int L1=21;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P22 implements Runnable {
     int L1=22;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P23 implements Runnable {
     int L1=23;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P24 implements Runnable {
     int L1=24;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 
class P25 implements Runnable {
     int L1=25;
                    public void run() {
     String pass="";
        int x=0;
        for (int L2=0;L2<Litter.length;L2++){
        for (int L3=0;L3<Litter.length;L3++){
            pass=(x++) +" : "+Litter[L1]+" "+Litter[L2]+" "+Litter[L3]+" ";
             System.out.println(pass);
      }
       
        }}}
//####################################################################################
 