#include<iostream>
using namespace std;

//

class Demo
{
    public:
        void Fun()
        {

        }
};

class Hello: public Demo
{
    public:
        void Gun()
        {

        }

};

int main()
{
    Hello hobj;

    hobj.Fun();
    hobj.Gun();
    
    return 0;
}