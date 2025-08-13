class Demo
{
    public int i,j;

    public Demo()
    {
        System.out.println("Inside Default Constructor..!");
        this.i = 0;
        this.j = 0;
    }
    
    public Demo(int a, int b)
    {
        System.out.println("Inside Parametrized Constructor..!");
        this.i = a;
        this.j = b;
    }

    protected void finalize()
    {
        System.out.println("Inside finalize method");
    }    
}

class ConstructorDemo
{
    public static void main(String B[])
    {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo(11,21);

        obj1 = null;
        obj2 = null;
        
        System.gc();

    }
}