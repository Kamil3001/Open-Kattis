#include <stdio.h>

int main() {
    int size;
    scanf("%d", &size);
    int a[100000];
    scanf("%d ", &a[0]);

    for(int i=1; i<size; i++){
        int num;
        scanf("%d", &num);
        if(num < a[i-1]){
            int j=i;
            while(j > 0 && num < a[j-1]){
                a[j] = a[j-1];
                a[j-1] = num;
                j--;
            }
        }
        else
            a[i] = num;
    }

    int charges=0;
    int i;
    for(i=0; i<size; i++){
        if(a[i] - charges > size)
            break;
        if(a[i] > charges)
            charges++;
    }

    charges += size - i;
    printf("%d", charges);
}