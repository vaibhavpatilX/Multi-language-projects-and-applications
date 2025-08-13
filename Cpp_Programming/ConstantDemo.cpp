#include<iostream>
using namespace std;

class Demo
{
    public:
        int i,j;
        const int x,y;

        Demo() : x(30) , y(40)
        {
            i = 0;
            j = 0;        
        }
        Demo(int a, int b , int c, int d) : x(c), y(d)          //initialization list //input by user
        {
            i = a;
            j = b;
        }
};

int main()
{
    Demo obj1;

    Demo obj2(1,2,3,4);

    cout<<"Value of obj1 is : "<<obj1.i<<"\t"<<obj1.j<<"\t"<<obj1.x<<"\t"<<obj1.y<<"\n";
    cout<<"Value of obj2 is : "<<obj2.i<<"\t"<<obj2.j<<"\t"<<obj2.x<<"\t"<<obj2.y<<"\n";

    obj1.i++;
    obj1.j++;
    //obj1.x++;     //NA
    //obj1.y++;     //NA
    return 0;
}