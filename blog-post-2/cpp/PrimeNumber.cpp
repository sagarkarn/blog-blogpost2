#include <iostream>
using namespace std;
int main()
{
    int number,isPrime,i;
    cout <<"Enter number";
    cin >> number;
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
        cout <<"%d is prime number",number;
    }
    else
    {
        cout <<"%d is not prime number",number;
    }
    return 0;
}