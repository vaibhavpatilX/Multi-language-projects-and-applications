class ArrayDemoLoop
{
    public static void main(String B[])
    {
        int Arr[] =  {10,20,30,40};
        
        System.out.println("For Loop: ");
        for(int i=0; i<Arr.length;i++)
        {
            System.out.println(Arr[i]);
        }

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("While Loop: ");
        int i = 0;

        while(i<Arr.length)
        {
            System.out.println(Arr[i]);
            i++;
        }

        System.out.println("-------------------------------------------------------------------------------");
        System.out.println(" Do While Loop: ");
        i = 0;

        do
        {
            System.out.println(Arr[i]);
            i++;
        }while(i<Arr.length);
    }
}