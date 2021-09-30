# I use a for loop and start with 2 then divide by every number up until the entered one. This checks to see if any number can divide into it and prove it is not a prime number.
# I also added a function to list out the factors for numbers that are not prime.
from symbol import factor
import math

#(make an is prime function) Make a function for testing whether a number is prime.



# Prints out the list of factors.
def listFactors(number):
    factors = 'Factors: '
    
    for j in range(2, number):
        if (number % j == 0):
            factors += str(j) + ','
            factorList.append(j)
    print(factors.rstrip(','))       

def isNumberPrime(testNumber):

    for i in range(2, testNumber-1):
        if (testNumber % i == 0):
            isPrime = False
            return isPrime
        else:
            isPrime = True
        
    return True

def getPrimeFactors(num):
    while num % 2 == 0:
        primeFactors.append(2)
        num = num / 2
         
    for i in range(3,int(math.sqrt(num))):
         
        while num % i== 0:
            primeFactors.append(i)
            num = num / i
             
    # Condition if n is a prime
    # number greater than 2
    if num > 2:
        primeFactors.append(num)

        
# Use this function to find the number of prime numbers less than 10000.

# Ask if user would like to check a number.
userNumber = int(input('Enter number to get the prime factors. \n'))

primeFactors = []

getPrimeFactors(userNumber)
print(primeFactors)
