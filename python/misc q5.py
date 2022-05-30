#removing consecutive similar letters

def removes(st):
    if len(st)<2:
        return st
    if st[0] != st[1]:
        return st[0]+removes(st[1:])
    else:
        return removes(st[2:])


if __name__=='__main__':
    st = input("Enter the string: ")
    for i in range(len(st)):
        temp = removes(st)
        st = temp
    print(f"The new string is: {temp}")