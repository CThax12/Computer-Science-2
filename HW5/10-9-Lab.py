names = ['Ryley', 'Edan', 'Reagan', 'Henry', 'Caius', 'Jane', 'Guto', 'Sonya', 'Tyrese', 'Johnny']
index = int(input())

# Type your code here.
try:
    print('Name: {}'.format(names[index]))
except IndexError as error:
    print("Exception! list index out of range")
    
    if index < 1:
        print('The closest name is: {}'.format(names[0]))
    else:
        print('The closest name is: {}'.format(names[-1]))
    
    
#input 12