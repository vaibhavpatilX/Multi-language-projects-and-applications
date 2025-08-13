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

class Derived : public Base
{
    public:
        int k;
        Derived()
        {
            cout<<"Inside Derived Constructor\n";
        }
        ~Derived()
        {
            cout<<"Inside Derived Destructor\n";
        }
};
class DerivedX : public Derived
{
    public:
        int p,q;
        DerivedX()
        {
            cout<<"Inside DerivedX Constructor\n";
        }
        ~DerivedX()
        {
            cout<<"Inside DerivedX Destructor\n";
        }
};
int main()
{
    DerivedX dobjx;
    Base bobj;
    Derived dobj;
    cout<<"__________________________________________________________________"<<"\n";
    cout<<"Size of Base is : "<<sizeof(bobj)<<"\n";
    cout<<"Size of Derived is : "<<sizeof(dobj)<<"\n";
    cout<<"Size of DerivedX is : "<<sizeof(dobjx)<<"\n";
    cout<<"__________________________________________________________________"<<"\n";
    return 0;
}