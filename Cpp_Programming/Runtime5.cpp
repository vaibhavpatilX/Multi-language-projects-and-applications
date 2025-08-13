#include<iostream>
using namespace std;

//ReDefination

class Demo
{
    public:
        void Fun(int i)
        {
            cout<<"Base Fun\n";
        }
};

class Hello: public Demo
{
    public:
        void Fun(int i,int j)
        {
            cout<<"Derived Fun\n";
        }

};

int main()
{
    Hello hobj;

    //NA hobj.Fun(11);
    hobj.Demo::Fun(11);
    hobj.Fun(11,21);
        
    return 0;
}