class adding implements Runnable
{
    int a,b; 
    public adding(int a, int b)
   {
        this.a = a;
        this.b = b;
    }
    public void run() 
    {
        add(a,b);
    }
    public void add(int a, int b)
   {
        int sum=0;
        synchronized (this) 
      {
            for(int i=a;i<=b;i++)
           {
                sum = sum+ a;
            }
            System.out.println("Summation of "+a+" to "+ b+" numbers = "+sum);    
        }
    }
}

public class addnumber 
{
    public static void main(String[] args) 
  {
        Thread t1 = new Thread(new adding(1,50));
        Thread t2 = new Thread(new adding(1,100));
        Thread t3 = new Thread(new adding(5,100));
        Thread t4 = new Thread(new adding(10,2000));
        Thread t5 = new Thread(new adding(15,20000));
        Thread t6 = new Thread(new adding(1,20000));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        
    }
}