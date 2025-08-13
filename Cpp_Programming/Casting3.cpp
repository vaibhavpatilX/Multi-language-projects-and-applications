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
    Demo *dp = new Hello;        //Upasting
    
    Hello *hp = new Demo;      //DownCasting    //NA

    return 0;
}