#ifndef _DEQUE_H_
#define _DEQUE_H_

struct Node {
    char **data;
    struct Node *next;
};

typedef struct {
    struct Node *head;
    unsigned int nItems;
    unsigned int capacity;
} Deque;

Deque *createDeque(unsigned int capacity);
int addItem(char* item, Deque* dp);
void destroyDeque(Deque* dp);
#endif

