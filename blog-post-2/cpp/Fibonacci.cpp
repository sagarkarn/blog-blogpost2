#include <iostream>
using namespace std;

int main()
{
    int number,next = 1,prev = 0,temp;
    cout <<"Enter number: ";
    cin >> number;
    if(number == 1){ 
        cout <<"0 ";
    }
    else
    {
        cout <<"0 1 ";
    }
    
    for (int i = 0; i < number - 2; i++)
    {
        cout <<(next + prev) << " ";
        temp = next + prev;
        prev = next;
        next = temp;
    }
}