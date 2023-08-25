# Find the sum of all the multples of 3 or 5 bellow 1000

def multiple(n):
    if(n % 3 == 0 or n % 5 == 0):
        return 1
    return 0

def main():
    suma_total = 0
    for i in range(0,1000):
        if(multiple(i)):
            suma_total += i
    print("The total sum is: " + str(suma_total))
    return

main()
    