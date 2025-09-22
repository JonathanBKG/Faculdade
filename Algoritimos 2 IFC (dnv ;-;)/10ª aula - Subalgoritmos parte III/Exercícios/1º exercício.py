a = [2,4,6,8,10,12,14,16,18,20]
b = [3,6,9,12,15,18,21,24,27,30]
c = []
def outerjoin(a,b):
    print(a)
    print(b)
    for l in range(len(a)):
        if a[l] not in b:
            c.append(a[l])
    print("\nOs valores que estão em A que não estão em B:")
            




outerjoin(a,b)
print(c)