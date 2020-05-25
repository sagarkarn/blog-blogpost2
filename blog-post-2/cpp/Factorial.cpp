#include <iostream>
using namespace std;

int main()
{
    int number,factorial = 1,i;
    cout <<"Enter number: ";
    cin >> number;
    for (int i = 1; i <= number; i++)
    {
        factorial *= i;
    }
    cout <<number<<"!= "<< factorial;
    return 0;
}
