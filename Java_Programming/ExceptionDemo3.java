import java.util.Scanner;

class Arithmetic
{
    public float Division(int no1, int no2) throws ArithmeticException
    {
        float ans = no1/no2;
        return ans;
    }
}

class ExceptionDemo3
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int value1 = sobj.nextInt();

        System.out.println("Enter Second number: ");
        int value2 = sobj.nextInt();


        Arithmetic aobj = new Arithmetic();
        float ret = 0.0f;

        try 
        {
            ret = aobj.Division(value1,value2);
        }

        catch(ArithmeticException obj)
        {
            System.out.println("Inside Catch..!");
        }
        System.out.println("Division is : "+ret);


    }

}