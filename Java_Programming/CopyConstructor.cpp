#include<iostream>
using namespace std;

class Demo
{
    public : 
        int No1,No2;

    Demo()
    {
        cout<<"Inside Default Constructor\n";
        this->No1 = 0;
        this->No2 = 0;
    }
    Demo(int A, int B)
    {
        cout<<"Inside Parametrized Constructor\n";
        this->No1 = A;
        this->No2 = B;
    }
    Demo(Demo &ref)         
    {
        cout<<"Inside Copy Constructor\n";
        this -> No1 = ref.No1;
        this -> No2 = ref.No2;
    }
    ~Demo()
    {
        cout<<"Inside Destructor\n";
    }
};

int main()
{
    Demo dobj1;
    Demo dobj2(11,21);
    Demo dobj3(dobj2);          //deep copy

    cout<<dobj1.No1<<"\t"<<dobj1.No2<<"\n";
    cout<<dobj2.No1<<"\t"<<dobj2.No2<<"\n";
    cout<<dobj2.No1<<"\t"<<dobj3.No2<<"\n";
    
    return 0;
}