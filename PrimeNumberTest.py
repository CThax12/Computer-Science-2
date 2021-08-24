#(make an is prime function) Make a function for testing whether a number is prime.
def isNumberPrime(testNumber):
    for i in range(2, testNumber-1):
        if (testNumber % i == 0):
            isPrime = False
            return isPrime
        else:
            isPrime = True
        
    return True

        
# Use this function to find the number of prime numbers less than 10000.
primeNumbers = 0
for j in range(2,10000):
    if isNumberPrime(j) == True:
        primeNumbers = primeNumbers + 1
print(primeNumbers)