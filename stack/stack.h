#ifndef _STACK_H_
#define _STACK_H_

struct int_stack
{
    unsigned int capacity;
    int *storage;
    unsigned int current;
};

struct int_stack *create();
int destroy(struct int_stack *stack_ptr);
int push(struct int_stack *stack_ptr, int n);
int pop(struct int_stack *stack_ptr, int *val);
#endif
