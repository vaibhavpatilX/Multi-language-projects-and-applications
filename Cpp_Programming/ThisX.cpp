//this pointer

#include<iostream>
using namespace std;

class Demo
{
    public:

        int i,j;
        Demo(int A,int B)
        {
            i = A;
            j = B;
        }
        void Display(int X)     //void Display(Demo *this, int X)
        {
            cout<<"Value of i is "<<this -> i<<"\n";
            cout<<"Value of j is "<<this -> j<<"\n";
        }
};
int main()
{
    Demo obj(11,21);

    obj.Display(51);        //Display(&obj,51)

    return 0;
}