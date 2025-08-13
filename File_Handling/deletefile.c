#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd = 0;
    char Fname[50];

    printf("Enter the file name you want to delete: \n");
    scanf("%s",Fname);

    unlink(Fname);
    
    return 0;
}