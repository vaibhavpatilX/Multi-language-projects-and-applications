import java.util.*;
//import java.util.Scanner;

class Input
{
    public static void main (String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int no1 = 0,no2 = 0,ans = 0;
        System.out.println("Enter First number : ");
        no1 = sobj.nextInt();

        System.out.println("Enter Second number : ");
        no2 = sobj.nextInt();

        ans = no1+no2;
        System.out.println("Addition is : "+ans);
    }
}