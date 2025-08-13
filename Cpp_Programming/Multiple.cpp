#include<iostream>
using namespace std;

class Base1
{
    public:
        int i,j;
        Base1()
        {
            cout<<"Inside Base1 Constructor\n";
        }
        ~Base1()
        {
            cout<<"Inside Base1 Destructor\n";
        }
};

class Base2
{
    public:
        int x,y;
        Base2()
        {
            cout<<"Inside Base2 Constructor\n";
        }
        ~Base2()
        {
            cout<<"Inside Base2 Destructor\n";
        }
};

class Derived : public Base2,Base1
{

    public:
        int a;
        Derived()
        {
            cout<<"Inside Derived Constructor\n";
        }
        ~Derived()
        {
            cout<<"Inside Derived Destructor\n";
        }
};
int main()
{
    Derived dobj;
    
    cout<<"__________________________________________________________________"<<"\n";
    cout<<"Size of Base1 is : "<<sizeof(Base1)<<"\n";
    cout<<"Size of Base2 is : "<<sizeof(Base2)<<"\n";
    cout<<"Size of Derived is : "<<sizeof(Derived)<<"\n";
    cout<<"__________________________________________________________________"<<"\n";
    return 0;
}