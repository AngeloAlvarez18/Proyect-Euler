# What is the 10001st prime number?

import math

def is_prime(n):
    a = math.floor(math.sqrt(n))
    for i in range(2, n):
        if(n % i == 0):
            return 0
    return 1

def num_of_prime_number(n):
    num_of_prime = 1
    i = 3
    while(num_of_prime != n):
        if(is_prime(i)):
            num_of_prime += 1
            
        i += 1
    return i-1

print(num_of_prime_number(10001))