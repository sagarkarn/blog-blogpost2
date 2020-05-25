#include <iostream>
using namespace std;

int main()
{
    int n1,d1,n2,d2,n3,d3,gcd,i,min;
    cout << "Enter first numerator and denumenator";
    cin >> n1;
    cin >> d1;
    cout << "Enter second numerator and denumenator";
    cin >> n2;
    cin >> d2;

    n3 = (n1 * d2) + (n2 * d1);
    d3 = d1 * d2;
    gcd = 0;
    min = n3 < d3 ? n3 : d3;
    for(i = 2; i <=min; i++ ){
        if(n3 % i == 0 && d3 % i == 0){
            gcd = i;
        }
    }
    if(gcd > 0){
        cout << "Sum: "<< n3/gcd << d3/gcd;
    }
    else cout << "Sum: " << n3 << "/" << d3;
}