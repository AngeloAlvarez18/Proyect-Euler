# What is the smallest positive number that is evenly divisible 
# (divisible with no remainder) by all of the numbers from 1 to 20?

# Check if the number is divisible by all the numbers from 1 to 20
def is_divisible(n):
    for i in range(1, 21):
        if(n % i != 0):
            return 0
    return 1
    

def smallest_int_divisible():
    i = 20
    smallest_num = 0
    flag = 1
    while(flag):
        if(is_divisible(i)):
            smallest_num = i
            flag = 0
        i += 1
    
    print("The smallest positive number is: " + str(smallest_num))

    return

smallest_int_divisible()