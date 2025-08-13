#include<iostream>
using namespace std;

class Base
{
    public:
        int i,j;
        
        int Addition(int no1,int no2)       //1000
        {
            return no1+no2;
        }
        virtual int substraction(int no1,int no2) =0;       //-----
};

class Derived : public Base
{
    public:
        int x,y;
        virtual int substraction(int no1,int no2)       //2000
        {
            return no1-no2;
        }
        virtual int Multiplication(int no1,int no2)     //3000
        {
            return no1*no2;
        }
};
int main()
{
    Base *bp = NULL;
    Derived dobj;

    bp = &dobj;

    return 0;
}