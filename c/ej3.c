#include <stdio.h>
#include <math.h>

// What is the largest prime factor of the number 600851475143?

int is_prime(int n){
    int a = floor(sqrt(n));
    for(int i = 2; i < a; i++){
        if(n % i == 0)
            return 0;
    }
    return 1;
}

int main(){
    unsigned long long b = 13195;
    unsigned long long largest_prime = 0;
    
    for(int i = 2; i < b; i++){
        if(b % i == 0){
            if(is_prime(i)){
                printf("%lu\n", i);
                largest_prime = i;
            }            
        }
    }
    printf("the largest prime factor is: %d\n", largest_prime);
    return 0;
}
    