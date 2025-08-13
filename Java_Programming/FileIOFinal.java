import java.io.*;

class FileIOFinal
{
    public static void main(String A[])
    {
        try
        {
            FileWriter fwobj = new FileWriter("MarvellousFinal.txt");
            fwobj.write("Pre-Placement Activity Batch 53"+System.getProperty( "line.separator"));
            //fwobj.write("\n");
            //fwobj.write("\r");
            
            fwobj.write("Logic-Building with Industrial Project Development");
            fwobj.close();
        }
        catch (Exception obj)
        {
            System.out.println("Exception Occured: "+obj);
        }
        
    }
}