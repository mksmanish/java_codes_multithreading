//program to implement 5 task using multithread

import java.awt.*;
import java.util.*;

class calculation extends Thread
{
 int flag;
 mkThreads(int x)
 {
  flag = x;
  start();//activate the threads
 }

 public void run()
 {
   if(flag == 1)
    add();
   else if(flag == 2)
    sub();
   else if(flag ==3)
    mul();
   else if(flag ==4)
    div();
   else if(flag ==5)
    power();
   
 }
void mul()
{
    int x=2,y=3;
    int c=x*y;
    System.out.println(" multiplication of two numbers is : "+c);
   
}


 void add()
 {
    int x=2,y=3;
    int c=x+y;
    System.out.println(" Addition of two numbers is : "+c);
  }



 void sub()
 { 
    int x=2,y=3;
    int c=x-y;
    System.out.println(" subtraction of two numbers is : "+c);
 }

 void div()
 { 
    int x=2,y=3;
    int c=x/y;
    System.out.println(" division of two numbers is : "+c);
 }

 void power()
 { 
    int x=2,y=3;
    int c=pow(2,3);
    System.out.println(" power of two numbers is : "+c);
 }

 public static void main(String args[])
 {
  mkThreads m1 = new mkThreads(1);
  mkThreads m2 = new mkThreads(2);
  mkThreads m3 = new mkThreads(3);
    mkThreads m2 = new mkThreads(4);
  mkThreads m3 = new mkThreads(5);
  
 }
}