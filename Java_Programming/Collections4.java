///////////////////////////////////////////////////////
//
//  File name :     Collections4.java
//  Descreption :   ArrayList - methods - add(),clear(),isEmpty()       
//  Author :        Vaibhav
//  Date :          11/06/2025
//
///////////////////////////////////////////////////////

import java.util.*;

class Collections4
{
    public static void main(String A[])
    {
        ArrayList <Integer> aobj = new ArrayList <Integer> ();

        aobj.add(11);
        aobj.add(21);
        aobj.add(51);
        aobj.add(101);

        System.out.println(aobj);

        aobj.add(3,41);

        System.out.println(aobj);

        if(aobj.contains(51))
        {
            System.out.println("Element is Present");
        }
        aobj.clear();

        System.out.println(aobj);

        if(aobj.isEmpty())
        {
            System.out.println("Empty");
        }
    }
}