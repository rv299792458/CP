t=int(input())
for i in range(t):
    sa=input().split(' ')
    sb=input().split(' ')
    cele=0
    for d in sa:
        if(d in sb):
            cele=d
            break
    if(cele==0):
        print('No')
        continue

    sa.remove(cele)
    sb.remove(cele)
    if(int(sa[0])+int(sb[0])==int(cele)):
        print("Yes")
    elif int(sa[0])==int(sb[0]) and int(cele)*2==int(sa[0]):
        print('Yes')
    else:
        print("No")
    
