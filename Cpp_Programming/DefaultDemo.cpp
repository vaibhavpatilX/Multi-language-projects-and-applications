//Default Argument1 

#include<iostream>
using namespace std;

float Area(float Rad, float PI)
{
    float Ans = 0.0f;
    Ans = PI * Rad * Rad;
    return Ans;
}

int main()
{
    float input = 0.0f;

    cout<<"Enter the radius of Circle: "<<"\n";
    cin>>input;

    cout<<"Area of Circle is : "<<Area(input,3.14f)<<"\n";
    return 0;
}