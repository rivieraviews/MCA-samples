#function that takes 'balloon' and returns 'bal*o*n'
#successive repeated characters replaced by *

def stars(st):
    if len(st) < 2:
        return st
    if st[0] != st[1]:
        return st[0]+stars(st[1:])
    else:
        return st[0]+"*"+stars(st[2:])  #adds a star if match found in 0th and 1th positions
        

if __name__ == '__main__':
    st = input("Enter a string: ")
    new = stars(st)
    #call stars
    print(f"The new string is: {new}")