//Default Argument OG

#include<iostream>
using namespace std;

float Area(float Rad, float PI = 3.14)      //DEfault Argumentnt should be at last incase of multiple arguments
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

    cout<<"Area of Circle is : "<<Area(input,7.10f)<<"\n";

    cout<<"Area of Circle with Default Argument is : "<<Area(input)<<"\n";

    return 0;
}