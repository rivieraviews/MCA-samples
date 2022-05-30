#sum of series 1+2+3+...+n

n = int(input("Enter the value of n: "))
sum = 0
for i in range(n):
    sum += i+1
print(f"The sum of the series is: {sum}")