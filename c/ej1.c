// Find the sum of all the multples of 3 or 5 bellow 1000
#include <stdio.h>

int multples(long n){
    if (n % 3 == 0 || n % 5 == 0)
        return 1;
    return 0;
}

int main(){
    long total_sum = 0;

    for(int i = 0; i < 1000; i++){
        if(multples(i))
            total_sum += i;
    }

    printf("the total sum is: %d\n", total_sum);
    return 0;
}