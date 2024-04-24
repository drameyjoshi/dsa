#include "deque.h"

#include <stddef.h>
#include <stdio.h>
#include <string.h>

void printDeque(Deque* dp)
{
    if (dp != NULL) {
        struct Node* curr = dp->head;
        while (curr != NULL) {
            printf("%s\n", *(curr->data));
            curr = curr->next;
        }
    }
}

void manualTest()
{
    char line[256];
    int proceed = 1;

    printf("Enter strings to be added to the deque.\n");
    printf("To stop, enter quit.\n");
    Deque *dp = createDeque();

    while (proceed) {
        printf("Enter a string: ");
        scanf("%s", line);

        if (strncmp(line, "quit", strlen("quit")) != 0) {
            addItem(line, dp);
            memset(line, 0, 256);
        } else 
            proceed = 0;
    }

    printDeque(dp);
    destroyDeque(dp);
}

int main(int argc, char* argv[])
{
    manualTest();
}

