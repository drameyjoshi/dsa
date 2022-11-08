#ifndef _STACK_H_
#define _STACK_H_

struct int_stack
{
    unsigned int capacity;
    int *storage;
    unsigned int current;
};

struct int_stack *create();
int destroy(struct int_stack *sp);
int push(struct int_stack *sp, int n);
int pop(struct int_stack *sp, int *val);
int is_empty(const struct int_stack *sp);
#endif
