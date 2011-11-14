#-*- coding: utf-8 -*-
t = input()
test = int(t)

n = []
for i in range(test):
    s = input()
    n.append(int(s))

for i in range(test):
    print (n[i]*n[i])


