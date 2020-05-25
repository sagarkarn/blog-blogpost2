#include <stdio.h>

int main()
{
    int num,reverse,rm;
    printf("Enter number: ");
    scanf("%d",&num);
    reverse = 0;
    while (num > 0)
    {
        rm = num % 10;
        reverse = (reverse * 10) + rm;
        num /= 10;
    }
    printf("reverse number: %d", reverse);
    return 0;
}