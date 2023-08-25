// By considering the terms in the Fibonacci sequence whose values do
// not exceed four million, find the sum of the even-valued terms.
#include <stdio.h>

int main(){
    int a = 0;
    int b = 1;
    int c = 0;
    int total_sum = 0;

    while(c < 4000000){
        if(c % 2 == 0)
            total_sum += c;
        c = a + b;
        a = b;
        b = c;
    }

    printf("the total sum is %d\n", total_sum);
    return 0;
}