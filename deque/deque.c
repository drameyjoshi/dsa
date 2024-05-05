#include "deque.h"
#include "logger.h"

#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

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
            error("Unable to allocate memory to store item.");
            pn = NULL;
        }
    } else {
        error("Unable to allocate memory to create deque node.");
    }

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

Deque* createDeque(unsigned int capacity)
{
    Deque* pd = (Deque *)malloc(sizeof(Deque));

    if (pd != NULL) {
        pd->head = NULL;
        pd->nItems = 0;
        pd->capacity = capacity;
    } else {
        error("Unable to allocate memory to create deque.");
    }
    
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

                if (dp->nItems > dp->capacity) {
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


