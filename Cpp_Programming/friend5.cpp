#include<iostream>
using namespace std;


class  Hello
{
    public:
        void Display();
        void Accept();
};

class Demo
{
    public: 
        int i;
    private:
        int j;
    protected:
        int k;
    
    public:
        Demo()
        {
            i =10; j=20; k=30;
        }
        friend class Hello;
};
void Hello:: Display()
{
    Demo obj;
    cout<<"_________________________________________________________________________\n";
    cout<<obj.i<<"\n";
    cout<<obj.j<<"\n";
    cout<<obj.k<<"\n";
    cout<<"_________________________________________________________________________\n";
}
void Hello:: Accept()
{
    Demo obj;
    cout<<obj.i<<"\n";
    cout<<obj.j<<"\n";
    cout<<obj.k<<"\n";
    cout<<"_________________________________________________________________________\n";
}
int main()
{
    Hello hobj;
    hobj.Accept();
    hobj.Display();
    return 0;
}