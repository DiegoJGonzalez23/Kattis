busnumbers = int(input())

buslist = list(map(int,input().split()))


def howfar(n):
    p = 0

    for i in range(n + 1, 1001):
        if i in buslist:
            p += 1

        else:
            return p

    return p


buslist.sort()
newlist = []
used = []


for i in buslist:
    x = buslist.index(i)
    p = howfar(i)
    if i not in used:


        if howfar(i) >= 2:
            newlist.append(str(i) + "-" + str(buslist[buslist.index(i) + howfar(i)]))
            for g in buslist[x:x + p + 1]:
                used.append(g)

        else:
            newlist.append(i)
            used.append(i)


print(*newlist)
