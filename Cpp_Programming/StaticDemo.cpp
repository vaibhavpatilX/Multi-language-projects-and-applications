#include<iostream>
using namespace std;

class Demo
{
    public:
        int i,j,k;
        static int x;

        Demo()
        {
            i = 10;
            j = 20;
            k = 30;
        }
        void Display()
        {
            cout<<"Inside Display\n";
            cout<<i<<"\t"<<j<<"\t"<<k<<"\n";
        }
        static void Help()
        {
            cout<<"Inside Help\n";
        }
    
};

int Demo::x = 51;

int main()
{
    Demo::Help();
    cout<<"Value of X is : "<<Demo::x;

    Demo obj1, obj2;

    obj1.Display();
    obj2.Display();
    
    cout<<"Value of obj1 i is "<<obj1.i<<"\n";
    cout<<"Value of obj2 i is "<<obj2.i<<"\n";

    obj1.Help();            //internal class name and static function name      //
    cout<<"Acces of Value of static x through object : "<<obj1.x<<"\n";
    return 0;
}