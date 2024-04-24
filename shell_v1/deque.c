#include "deque.h"

#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

static const int BUFSIZE = 4;

static struct Node* createNode(char* item)
{
    struct Node* pn = (struct Node*)malloc(sizeof(struct Node));

    if (pn != NULL) {
        size_t len = strlen(item);
        pn->data = (char **)malloc(sizeof(char *));
        if (pn->data != NULL) {
            *(pn->data) = (char *)calloc(len + 1, sizeof(char));
            strncpy(*(pn->data), item, len);
            pn->next = NULL;
        } else {
            free(pn);
            // To do: log error.
            pn = NULL;
        }
    }
    // To do: log error.

    return pn;
}

static void freeNode(struct Node* pn)
{
    if (pn != NULL) {
        free(*(pn->data));
        free(pn->data);
        free(pn);
    }
}

Deque* createDeque()
{
    Deque* pd = (Deque *)malloc(sizeof(Deque));

    if (pd != NULL) {
        pd->head = NULL;
        pd->nItems = 0;
    }
    // To do: log error,
    
    return pd;
}

int addItem(char* item, Deque* dp)
{
    int rv = 0;

    if (dp != NULL) {
        struct Node* pn = createNode(item);

        if (pn != NULL) {
            if (dp->head == NULL) {
                dp->head = pn;
                dp->nItems = 1;
            } else {
                struct Node* curr = dp->head;
                while (curr->next != NULL)
                    curr = curr->next;

                curr->next = pn;
                dp->nItems += 1;

                if (dp->nItems > BUFSIZE) {
                    struct Node* prevHead = dp->head;
                    dp->head = dp->head->next;
                    dp->nItems -= 1;
                    free(prevHead);
                }
            }
        } else 
            rv = 1;
    } else 
        rv = 1;

    return rv;
}

void destroyDeque(Deque* dp)
{
    if (dp != NULL) {
        struct Node* curr = dp->head;
        struct Node* next = NULL;

        while (curr != NULL) {
            next = curr->next;
            freeNode(curr);
            curr = next;
        }

        free(dp);
    }
}


