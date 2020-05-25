#include <stdio.h>

int main()
{
    int number,isPrime,i;
    printf("Enter number");
    scanf("%d",&number);
    isPrime = 1;
    if (number != 2)
    {
        for (int i = 2; i <= number / 2; i++)
        {
            if (number % i == 0)
            {
                isPrime = 0;
                break;
            }
        }
    }

    if (isPrime)
    {
        printf("%d is prime number",number);
    }
    else
    {
        printf("%d is not prime number",number);
    }
    return 0;
}