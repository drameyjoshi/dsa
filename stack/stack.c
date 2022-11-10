#include "stack.h"

#include <stdlib.h>

static int INIT_CAPACITY = 64;
static int INCREMENT_BY = 2;

int is_empty(const struct int_stack* sp)
{
    return (sp->current > 0) ? 0 : 1;
}

struct int_stack* create()
{
    struct int_stack* sp = (struct int_stack*)malloc(sizeof(struct int_stack));
    if (sp != NULL) {
        sp->capacity = INIT_CAPACITY;
        sp->storage = (int*)calloc(sizeof(int), INIT_CAPACITY);

        if (sp->storage == NULL) {
            free(sp);
            sp = NULL;
        } else {
            sp->current = 0;
        }
    }

    return sp;
}

int push(struct int_stack* sp, int n)
{
    int success = 1;

    if (sp != NULL) {
        if (sp->current < sp->capacity) {
            sp->storage[sp->current++] = n;
            success = 0;
        } else {
            int new_capacity = INCREMENT_BY * (sp->capacity);
            int* newptr = realloc(sp->storage, new_capacity * sizeof(int));
            if (newptr != NULL) {
                sp->capacity = INCREMENT_BY * sp->capacity;
                sp->storage = newptr;
                sp->storage[sp->current++] = n;
                success = 0;
            }
        }
    }

    return success;
}

int pop(struct int_stack* sp, int* val)
{
    int success = 1;

    if (sp != NULL) {
        if (sp->current > 0) {
            *val = sp->storage[--sp->current];
            success = 0;
        }
    }

    return success;
}

int destroy(struct int_stack* sp)
{
    int success = 1;

    if (sp != NULL) {
        if (sp->storage != NULL) {
            free(sp->storage);
            free(sp);
            success = 0;
        }
    }

    return success;
}
