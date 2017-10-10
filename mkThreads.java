

import java.awt.*;

class mkThreads extends Thread
{
 int flag;
 mkThreads(int x)
 {
  flag = x;
  start();
 }

 public void run()
 {
   if(flag == 1)
    fx1();
   else if(flag == 2)
    fx2();
   else if(flag ==3)
    fx3();
   else if(flag ==4)
    fx4();
  else if(flag ==5)
    fx5();
  else if(flag ==6)
    fx6();
  else if(flag ==7)
    fx7();
   else if(flag ==8)
    fx8();
  else if(flag ==9)
    fx9();
   else if(flag ==10)
    fx10();
   
 }
void fx3()
{
   int i;
   for(i=0;i<5000;i++)
    System.out.print(" k ");
}
void fx4()
{
   int i;
   for(i=0;i<5000;i++)
    System.out.print(" W ");
}
void fx5()
{
   int i;
   for(i=0;i<5000;i++)
    System.out.print(" E ");
}
void fx6()
{
   int i;
   for(i=0;i<5000;i++)
    System.out.print(" U ");
}
void fx7()
{
   int i;
   for(i=0;i<5000;i++)
    System.out.print(" O ");
}
void fx8()
{
   int i;
   for(i=0;i<5000;i++)
    System.out.print(" Q ");
}
void fx9()
{
   int i;
   for(i=0;i<5000;i++)
    System.out.print(" MANISH ");
}
void fx10()
{
   int i;
   for(i=0;i<5000;i++)
    System.out.print(" anish ");
}
 void fx1()
 {
  Toolkit t = Toolkit.getDefaultToolkit();
  int i; 
  for(i =0; i < 20; i++)
  {
    t.beep();
    try
    {
       Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {} 
  }//for 

 }


 void fx2()
 {
  int i;
  for(i =0; i < 5000; i++)
   System.out.print("  T ");

 }

 public static void main(String args[])
 {
  mkThreads m1 = new mkThreads(1);
  mkThreads m2 = new mkThreads(2);
  mkThreads m3 = new mkThreads(3);
  mkThreads m4  = new mkThreads(4);
  mkThreads m5  = new mkThreads(5);
  mkThreads m6  = new mkThreads(6);
  mkThreads m7  = new mkThreads(7);
  mkThreads m8  = new mkThreads(8);
  mkThreads m9  = new mkThreads(9);
  mkThreads m10 = new mkThreads(10);
 




  int i;
  for(i =0; i < 5000; i++)
   System.out.print("  M ");
 }//main
}