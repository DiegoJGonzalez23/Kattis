S = input() # c0deninja5
P = input() # c0deninja
X = 0
Y = "Yes"
N = "No"

if P == S:
    print(Y)
    X = 1

for i in range(0, 10):
    if str(i) + P == S:
        print(Y)
        X = 1

for j in range(0, 10):
    if P + str(j) == S:
        print(Y)
        X = 1

if P.swapcase() == S:
    print(Y)
    X = 1

if X == 0:
    print(N)
