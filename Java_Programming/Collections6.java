///////////////////////////////////////////////////////
//
//  File name :     Collections6.java
//  Discreption :   LinkedList   - add(),remove(),size()
//                  Iterator(Class) - iterator(),hasNext(),next()
//  Author :        Vaibhav
//  Date :          11/06/2025
//
///////////////////////////////////////////////////////

import java.util.*;

class Collections6
{
    public static void main(String A[])
    {
        LinkedList <Integer> aobj = new LinkedList <Integer> ();

        aobj.add(11);
        aobj.add(21);
        aobj.add(51);
        aobj.add(101);

        aobj.remove(3);

        Iterator iobj = aobj.iterator();

        System.out.println("Elements of the LinkedList are : ");

        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }
        System.out.println(aobj.size());   
    }
}