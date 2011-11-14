#include <stdio.h>
#include <stdlib.h>

int n = 0;
int i = 0;
int tab[30];
int main()
{
    scanf("%d",&n);
    for(i=0; i<n; i++)
        scanf("%d",&tab[i]);
    for(i=0; i<n; i++)
        printf("%d\n",(tab[i]*tab[i]));
    return 0;
}


