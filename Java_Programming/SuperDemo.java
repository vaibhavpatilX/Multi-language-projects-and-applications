
class Base
{
    public int x,y;

    public Base(int a, int b)
    {
        this.x = a;
        this.y = b;
    }
    public void Fun()
    {
        System.out.println("Inside Base Fun");
    }    
}

class Derived extends Base
{
    public int x,y;
    public Derived()
    {
        super(11,21);           //Use 1
        this.x = 51;
        this.y = 101;
    }

    public void Fun()
    {
        super.Fun();        //Use 2
        System.out.println("Inside Derived Fun");
        System.out.println("Value of X is : "+x);
        System.out.println("Value of X using super is : "+super.x);     //Use 3
    }

}

class SuperDemo
{
    public static void main(String A[]) 
    {
        Derived dobj = new Derived();
        dobj.Fun();
    }
}