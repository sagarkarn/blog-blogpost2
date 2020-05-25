#include <iostream>
using namespace std;

int main()
{
    int num,reverse,rm;
    cout << "Enter number: ";
    cin >> num;
    reverse = 0;
    while (num > 0)
    {
        rm = num % 10;
        reverse = (reverse * 10) + rm;
        num /= 10;
    }
    cout << "reverse number: " << reverse;
    return 0;
}