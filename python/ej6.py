# Find the difference between the sum of the squares of the first 
# one hundred natural numbers and the square of the sum.

def difference(n):
    sumatoria_cuadrados = (n*(n+1)*(2*n+1))/6
    sumatoria = (n*(n+1))/2
    sumatoria_final =  sumatoria*sumatoria
    print("the difference is: " + str(int(sumatoria_final-sumatoria_cuadrados)))
    return

difference(100)