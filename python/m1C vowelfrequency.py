#frequency of vowels from a string

st = input("Enter a string: ").lower()
count = {'a': 0,
         'e': 0,
         'i': 0,
         'o': 0,
         'u': 0}

#Counting vowels

for i in st:
    if i in count:
        count[i] += 1

#deleting not present values

newcount = {key:val for key,val in count.items() if val != 0}

#print the result

print(f"The frequency of vowels is: {newcount}")