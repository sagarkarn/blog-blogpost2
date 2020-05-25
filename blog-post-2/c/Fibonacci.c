#include <stdio.h>

int main()
{
    int number,next = 1,prev = 0,temp;
    printf("Enter number: ");
    scanf("%d",&number);
    if(number == 1){ 
        printf("0 ");
    }
    else
    {
        printf("0 1 ");
    }
    
    for (int i = 0; i < number - 2; i++)
    {
        printf("%d ",(next + prev));
        temp = next + prev;
        prev = next;
        next = temp;
    }
}