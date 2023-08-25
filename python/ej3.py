import math

# What is the largest prime factor of the number 600851475143?

# Chequearemos el mayor factor primo solo hasta raiz de n, no hasta n en si

def is_prime(n):
    a = math.floor(math.sqrt(n))
    for i in range(2, a):
        if(n % i == 0):
            return 0
    return 1

def main():
    b = math.floor(600851475143 / 2) + 1
    largest_prime = 0
    for i in range(2, b):
        if(b % i == 0 and is_prime(i)):
            largest_prime = i
    print("The larges prime factor is: " + str(largest_prime))
    return

main()