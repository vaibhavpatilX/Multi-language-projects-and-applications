///////////////////////////////////////////////////////
//
//  File name :     Collections3.java
//  Descreption :   Arrays - methods - sort() , binarySearch() operations on Float Array
//  Author :        Vaibhav
//  Date :          11/06/2025
//
///////////////////////////////////////////////////////

import java.util.*;

class Collections3
{
    public static void main(String A[])
    {
        float Arr[] = {11.89f,51.89f,21.45f,101.89f,75.89f,95.89f};

        System.out.println("--- Data traversal using for - each ---");
        for(float iNo : Arr)
        {
            System.out.println(iNo);
        }
        
        Arrays.sort(Arr);

        System.out.println("--- Data traversal using for - each after Sorting... ---");
        for(float iNo : Arr)
        {
            System.out.println(iNo);
        }        

        int iRet = 0;

        iRet = Arrays.binarySearch(Arr,21.45f);

        System.out.println("Return value of binary search is : "+iRet);


        iRet = Arrays.binarySearch(Arr,121.89f);

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