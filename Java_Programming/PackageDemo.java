import Marvellous.PPA;
import Marvellous.LB;
import Marvellous.Infosystems.Python;


class PackageDemo
{
    public static void main(String A[])
    {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Inside main in Package Demo");
        System.out.println("-------------------------------------------------------------------");
        
        PPA pobj = new PPA();
        LB lobj = new LB();
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
C:\Users\patil\OneDrive\Desktop\Java_Programming>javac PPA.java -d .


C:\Users\patil\OneDrive\Desktop\Java_Programming>javac LB.java -d .

C:\Users\patil\OneDrive\Desktop\Java_Programming>javac Python.java -d .
//////////////
C:\Users\patil\OneDrive\Desktop\Java_Programming>javac PackageDemo.java

C:\Users\patil\OneDrive\Desktop\Java_Programming>java PackageDemo
 */