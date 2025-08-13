import java.io.*;

class FileIO2
{
    public static void main(String A[])
    {
        try
        {
            FileWriter fwobj = new FileWriter("MarvellousX.txt");
            fwobj.write("Pre-Placement Activity Batch 53");
            fwobj.write("Logic-Building with Industrial Project Development");
            fwobj.close();
        }
        catch (Exception obj)
        {
            System.out.println("Exception Occured: "+obj);
        }
        
    }
}