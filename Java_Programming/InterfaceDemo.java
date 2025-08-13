import java.io.*;

interface Circle
{

    float PI = 3.14f;

    float CalculateArea(float Radius);
    float CalculateCircumfarence(float Radius);
}


class Marvellous implements Circle
{

    public float CalculateArea(float Radius)
    {

        float Area = 0.0f;
        Area = PI * Radius * Radius;
        return Area;
    }

    /*
    //Empty Body
    public float CalculateCircumfarence(float Radius)
    {
        return 0.0f;
    }
    */

    public float CalculateCircumfarence(float Radius)
    {
        float Ciccumfarence = 0.0f;
        Ciccumfarence = 2 * PI * Radius;
        return Ciccumfarence;
    }
    
}
class InterfaceDemo
{
    public static void main(String A[]) throws Exception
    {
        System.out.println("Value of PI : "+Circle.PI);
        //      Circle.PI = 7.10f;      //ERROR due to final
        
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        Marvellous mobj = new Marvellous();

        System.out.println("Enter Radhius: ");
        float Rad = Float.parseFloat(bobj.readLine());

        System.out.println("Area is : "+mobj.CalculateArea(Rad));
        System.out.println("Circumfarence is : "+mobj.CalculateCircumfarence(Rad));

    }
}