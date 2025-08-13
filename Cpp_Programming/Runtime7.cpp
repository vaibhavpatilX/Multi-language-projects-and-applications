#include<iostream>
using namespace std;

//

int main()
{
    char ch = 'A';
    int i = 11;
    
    char *cp =(char*) &i;       //UpCasting
    int *ip = (int*) &ch;       //DownCasting
            
    return 0;
}