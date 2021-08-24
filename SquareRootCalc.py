#Build a function to provide the square root of a number. 

def squareRoot(num):
    if num == 0:
        return 0
    guess = num/2
    lastNumber = num + 1
    
    while guess != lastNumber:
        newNumber = num/guess
        lastNumber = guess
        guess = (guess+newNumber)/2
        
    return guess

#Write another code to demonstrate your function works.

print('The square root of 100 is:', squareRoot(100))
print('The approximate square root of 50 is:', squareRoot(50))
print('Input a number to get the square root.')
userNumber = float(input())

print('The square root of', userNumber, 'is:', squareRoot(userNumber))