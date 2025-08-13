import Class.PrePlacement;
import Class.LogicBuilding;
import Class.Batch.Python;

class PackageClass
{
    public static void main(String A[])
    {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Inside main in Package Class");
        System.out.println("-------------------------------------------------------------------");
        
        PrePlacement pobj = new PrePlacement();
        LogicBuilding lobj = new LogicBuilding();
        Python pyobj = new Python();

        pobj.DisplayPPA();
        System.out.println("-------------------------------------------------------------------");
        
        lobj.DisplayLB();
        System.out.println("-------------------------------------------------------------------");
        
        pyobj.DisplayPython();
        System.out.println("-------------------------------------------------------------------");
    }   

}

/**
 * 

C:\Users\patil\OneDrive\Desktop\Java_Programming>javac PrePlacement.java -d .

C:\Users\patil\OneDrive\Desktop\Java_Programming>javac LogicBuilding.java -d .

C:\Users\patil\OneDrive\Desktop\Java_Programming>javac Python.java -d .

///////////////////////////////////////////
C:\Users\patil\OneDrive\Desktop\Java_Programming>javac PackageClass.java

C:\Users\patil\OneDrive\Desktop\Java_Programming>java PackageClass
 */