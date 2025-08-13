
class Demo extends Thread
{
    public void run()
    {
        
    }
    
}

class ThreadDemo11
{
    public static void main(String A[]) 
    {
        Demo obj = new Demo();

        System.out.println("Current Priority : "+obj.getPriority());

        obj.setPriority(10);
        System.out.println("Current Priority : "+obj.getPriority());

    }
}