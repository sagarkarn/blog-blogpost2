#include<stdio.h>

int main(){
    int n1,d1,n2,d2,n3,d3,gcd,i,min;
    printf("Enter first numerator and denumenator");
    scanf("%d",&n1);
    scanf("%d",&d1);
    printf("Enter second numerator and denumenator");
    scanf("%d",&n2);
    scanf("%d",&d2);

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
        printf("Sum: %d/%d",n3/gcd,d3/gcd);
    }
    else printf("Sum: %d/%d",n3,d3);
}