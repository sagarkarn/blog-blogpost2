#include <stdio.h>

int main()
{

    int num1, num2, num3, gt;

    printf("Enter three number: ");
    scanf("%d %d %d",&num1,&num2,&num3);
    
    if (num1 > num2)
    {
        gt = num1;
    }
    else if (num2 > num3)
    {
        gt = num2;
    }
    else
    {
        gt = num3;
    }
    printf("Greater number: %d", gt);
        
}