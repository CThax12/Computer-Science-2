# I use a for loop and start with 2 then divide by every number up until the entered one. This checks to see if any number can divide into it and prove it is not a prime number.
# I also added a function to list out the factors for numbers that are not prime.


#(make an is prime function) Make a function for testing whether a number is prime.



# Prints out the list of factors.
def listFactors(number):
    factors = 'Factors: '
    
    for j in range(2, number):
        if (number % j == 0):
            factors += str(j) + ','
    print(factors.rstrip(','))       

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
print('Amount of prime numbers under 10,000:', primeNumbers)

# Ask if user would like to check a number.
userNumber = int(input('Enter number to check if it is prime and see the factors.\n'))

if(isNumberPrime(userNumber) == False):
    print(userNumber, 'is not a prime number.')
    listFactors(userNumber)
else:
    print(userNumber, 'is a prime number.')

