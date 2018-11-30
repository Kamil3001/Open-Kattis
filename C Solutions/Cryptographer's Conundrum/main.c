#include <stdio.h>

int main() {
    char s[300];
    scanf("%s", s);

    int i=0;
    int day_count=0;
    while(i<300 && s[i] != '\0') {
        if ((i % 3 == 0 && s[i] != 'P') || (i % 3 == 1 && s[i] != 'E') || (i % 3 == 2 && s[i] != 'R'))
            day_count++;
        i++;
    }
    printf("%d", day_count);
}