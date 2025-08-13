#include<iostream>
using namespace std;

class Base
{
    public:
        int i,j;
        Base()
        {
            cout<<"Inside Base Constructor\n";
        }
        ~Base()
        {
            cout<<"Inside Base Destructor\n";
        }
};

class Derived1 : public Base
{

    public:
        int a;
        Derived1()
        {
            cout<<"Inside Derived1 Constructor\n";
        }
        ~Derived1()
        {
            cout<<"Inside Derived1 Destructor\n";
        }
};

class Derived2 : public Base
{

    public:
        int b;
        Derived2()
        {
            cout<<"Inside Derived2 Constructor\n";
        }
        ~Derived2()
        {
            cout<<"Inside Derived2 Destructor\n";
        }
};
int main()
{
    Derived1 dobj1;
    cout<<"__________________________________________________________________"<<"\n";
    Derived2 dobj2;
    cout<<"__________________________________________________________________"<<"\n";
    
    cout<<"__________________________________________________________________"<<"\n";
    cout<<"Size of Base is : "<<sizeof(Base)<<"\n";
    cout<<"Size of Derived1 is : "<<sizeof(Derived1)<<"\n";
    cout<<"Size of Derived2 is : "<<sizeof(Derived2)<<"\n";
    cout<<"__________________________________________________________________"<<"\n";
    return 0;
}