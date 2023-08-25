# By considering the terms in the Fibonacci sequence whose values do
# not exceed four million, find the sum of the even-valued terms.

def main():
    a = 0
    b = 1
    c = 0
    total_sum = 0
    while(c < 4000000):
        if(c % 2 == 0):
            total_sum += c
        c = a + b
        a = b
        b = c
    print("the total sum is: " + str(total_sum))
    return

main()