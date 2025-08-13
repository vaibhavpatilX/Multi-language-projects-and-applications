class ArrayDemo
{
    public static void main(String B[])
    {
        int Arr[] =  {10,20,30,40};
        //int Brr[5] =  {10,20,30,40};      //NOT ALLOWD because of SIze mentioned 

        int Crr[] =  new int[4];

        Crr[0] = 10;
        Crr[1] = 20;
        Crr[2] = 30;
        Crr[3] = 40;        

        System.out.println("Length of Crr is : "+Crr.length+" bytes");          //length Property

        String str = "Marvellous";

        System.out.println("Length of str is : "+str.length()+" alphabets");        //length MEthod
        
    }
}