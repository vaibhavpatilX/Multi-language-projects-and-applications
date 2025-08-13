#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd = 0;
    char Fname[50];
    int Ret = 0;
    char Buffer[50] = {'\0'};

    printf("Enter the file name : \n");
    scanf("%s",Fname);

    fd = open(Fname, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file");
        return -1;
    }
    
    Ret = read(fd,Buffer,5);        ///fd not written in book prototype
    printf("%d bytes gets read successfully\n",Ret);
    
    printf("Data from file is %s\n",Buffer);
    
    close(fd);
    return 0;
}