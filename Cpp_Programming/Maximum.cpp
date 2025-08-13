#include<iostream>
using namespace std;

int main()
{
    int No1 = 0;
    int No2 = 0;

    cout<<"Enter first number : ";
    cin<<"%d",&No1;

    
    cout<<"Enter first number : ";
    cin<<"%d",&No2;

    if(No1>No2)
    {
        cout<<"%d is Maximum number\n",No1;
    }
    else
    {
        cout<<"%d is Maximum number\n",No2;
    }

    return 0;
}