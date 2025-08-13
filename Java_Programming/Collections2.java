///////////////////////////////////////////////////////
//
//  File name :     Collections2.java
//  Description :   Demonstrates usage of Java Arrays utility methods:
//                  sort(), binarySearch() operations on Integer Array 
//  Author :        Vaibhav
//  Date :          11/06/2025
//
///////////////////////////////////////////////////////

import java.util.*;

class Collections2
{
    public static void main(String A[])
    {
        int Arr[] = {11,51,21,101,75,95};

        System.out.println("--- Data traversal using for - each ---");
        for(int iNo : Arr)
        {
            System.out.println(iNo);
        }
        
        Arrays.sort(Arr);

        System.out.println("--- Data traversal using for - each after Sorting... ---");
        for(int iNo : Arr)
        {
            System.out.println(iNo);
        }        

        int iRet = 0;

        iRet = Arrays.binarySearch(Arr,21);

        System.out.println("Return value of binary search is : "+iRet);


        iRet = Arrays.binarySearch(Arr,121);

        if(iRet >= 0)
        {
            System.out.println("Element is present");
        }
        else
        {
            System.out.println("There is no such Element");
        }
        
            
    }
}