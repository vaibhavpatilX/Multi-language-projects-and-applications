
class Demo
{
    public int i;
    //public final int j;       //NOT ALLOWED ERROR
    //  public final int j = 21;        //allowed

    public final int j;

    Demo()
    {
        i = 10;
        j = 20;
    }
}

class FinalDemo2
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();

        dobj.i++;
        //dobj.j++;     ERROR

    }
}