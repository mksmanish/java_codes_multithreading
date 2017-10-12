import javax.swing.*;
import java.awt.*;
import java.util.Date;
import java.text.SimpleDateFormat;

class DigitalClock extends JFrame implements Runnable
{
 boolean flag;
 Thread t;

 JLabel mks;
 
 Date d;
 SimpleDateFormat sdf;

 DigitalClock(String s)
 {

  d = new Date();
  sdf = new SimpleDateFormat("HH:mm:ss ### dd/MM/yyyy");

  initComponents();
  setTitle(s);
  setSize(800, 500);//w,h
  setResizable(false);
  setDefaultCloseOperation(EXIT_ON_CLOSE);//jvm exit
  setVisible(true);//render it

  flag = true;
  t = new Thread(this);
  t.start();

 }

 void initComponents()
 {
  //define the components
  mks = new JLabel(getDateTime());

  //few component properties
  mks.setForeground(Color.black);
  mks.setFont(new Font("Matura MT Script Capitals", Font.BOLD, 60));//font,style,size
  mks.setHorizontalAlignment(JLabel.CENTER);

  //add the components into the window
  add(mks);
   mks.setBounds(80, 100, 300, 80);//x,y,w,h  
  
 } 

 String getDateTime()
 {
   d.setTime(System.currentTimeMillis());
   return sdf.format(d);
 }

 public void run()
 {
  while(flag)
  {
   try
   {
    mks.setText(getDateTime());
    Thread.sleep(990);
   }
   catch(Exception ex)
   {}
  }
 }
 
 public static void main(String args[])
 {
  new DigitalClock("Digital Clock");
  
 }//main
}
