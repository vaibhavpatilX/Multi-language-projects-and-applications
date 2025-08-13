#include<iostream>
using namespace std;

class Base
{
    public:
        int i,j;    

        virtual void Fun()
        {
            cout<<"Base Fun\n";
        }
        virtual void Gun()
        {
            cout<<"Base Gun\n";
        }
        void Sun()
        {
            cout<<"Base Sun\n";
        }
        void Run()
        {
            cout<<"Base Run\n";
        }
};

class Derived: public Base
{
    public:
        int x,y;

        void Fun()          //by default virtual //by default override
        {
            cout<<"Derived Fun\n";
        }
        virtual void Gun()
        {
            cout<<"Derived Gun\n";
        }
        
        virtual void Run()
        {
            cout<<"Derived Run\n";
        }
        virtual void Mun()
        {
            cout<<"Derived Mun\n";
        }
};

int main()
{
    Base *bp = NULL;
    Derived dobj;
    
    bp = &dobj;

    bp -> Fun();                //Derived Fun
    bp -> Gun();                //Derived Gun
    bp -> Sun();                //Base Sun
    bp -> Run();                //Base Run
    //bp -> Mun();                //ERROR
    
    return 0;
}