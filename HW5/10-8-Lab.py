# Split input into 2 parts: name and age
parts = input().split()
name = parts[0]
while name != '-1':
    # FIXME: The following line will throw ValueError exception.
    #        Insert try/except blocks to catch the exception.
    try:
        age = int(parts[1]) + 1
        print('{} {}'.format(name, age))
    except ValueError as error:
        print('{} {}'.format(name, 0))
    # Get next line
    parts = input().split()
    name = parts[0]
    
    #Lee 18
    #Lua 21
    #Mary Beth 19
    #Stu 33
    #-1