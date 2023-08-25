import math

# Find the largest palindrome made from the product of two -digit numbers.

# Return 1 if the number is palindrome, 0 in other case.
def is_palindrome(n):
    len_str = math.floor(len(str(n)) / 2)
    str_num_len = len(str(n)) - 1 
    num_str = str(n)
    
    for i in range(0, len_str):
        if(num_str[i] != num_str[str_num_len - i]):
            return 0
    return 1

def find_largest_palindrome_product():
    largest_palindrome = 0
    for i in range(999, 0, -1):
        for j in range(999, 0, -1):
            if(is_palindrome(i*j)):
                #print("palindrome: " + str(i) + "*" + str(j) + " = " + str(i*j))
                if(i*j > largest_palindrome):
                    largest_palindrome = i*j
    return largest_palindrome
            
        
print("largest palindrome: " + str(find_largest_palindrome_product()))

