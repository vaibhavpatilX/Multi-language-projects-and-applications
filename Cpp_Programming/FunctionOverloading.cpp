#include<iostream>
using namespace std;

class Demo
{
    public:
        int Addition(int no1, int no2)
        {
            cout<<"Inside First Addition"<<"\n";
            return no1+no2;
        }

        int Additioln(int no1, int no2,int no3)
        {
            cout<<"Inside Second Addition"<<"\n";
            return no1+no2+no3;
        }

        int Addition(float no1, float no2)
        {
            cout<<"Inside Third Addition"<<"\n";
            return no1+no2;
        }

};
int main()
{
    Demo obj;
    
    cout<<obj.Addition(10,11)<<"\n";
    cout<<obj.Addition(10,11,21)<<"\n";
    cout<<obj.Addition(10.0f,11.2f)<<"\n";
    return 0;
}