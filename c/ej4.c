#include <stdio.h>
#include <math.h>
#include <string.h>

// Find the largest palindrome made from the product of two -digit numbers.

// Return 1 if the number is palindrome, 0 in other case.
int is_palindrome(int n){
    char cadena[20];
    sprintf(cadena, "%d", n); // convertimos el numero a una cadena

    int num_mitad = floor(strlen(cadena) / 2);
    int num_len = strlen(cadena) - 1;

    for(int i = 0; i < num_mitad; i++){
        if(cadena[i] != cadena[num_len - i])
            return 0;
    }

    return 1;
}

int main(){
    int largest_palindrome = 0;

    for(int i = 999; i > 0; i--){
        for(int j = 999; j > 0; j--){
            if(is_palindrome(i*j)){
                if(i*j > largest_palindrome)
                    largest_palindrome = i*j;
            }
        }
    }

    printf("largest palindrome: %d\n", largest_palindrome);

    return 0;
}