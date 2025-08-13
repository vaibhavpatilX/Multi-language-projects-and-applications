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

int main()
{
    //Base bobj;
    Derived dobj;

//    cout<<"Size of Base is : "<<sizeof(bobj)<<"\n";
  //  cout<<"Size of Base is : "<<sizeof(dobj)<<"\n";

    return 0;
}