#include<iostream>
using namespace std;

class Demo
{
    public:
        int i,j,k;

};

class Hello: public Demo
{
    public:
        int x,y;

};

int main()
{
    Demo *dp = new Demo;        //NoCasting
    
    Hello *hp = new Hello;      //NoCasting

    return 0;
}