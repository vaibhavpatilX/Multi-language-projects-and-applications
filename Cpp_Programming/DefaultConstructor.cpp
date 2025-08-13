//ERror

#include<iostream>
using namespace std;

class Demo
{
    public: 
        int i,j;

        Demo()
        {
            i = 0; 
            j = 0;
        }
        Demo(int a)
        {
            cout<<"Inside 2nd Demo"<<"\n";
            i = 0
            j = 0;
        }
        Demo(int a, int b)
        {
            cout<<"Inside 3rd Demo"<<"\n";
            i = a;
            j = b;
        }      
};

int main()
{
    Demo obj1;
    Demo obj2(11);
    Demo obj3(11,21);
    return 0;
}