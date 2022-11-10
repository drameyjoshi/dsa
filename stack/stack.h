#ifndef _STACK_H_
#define _STACK_H_

/*
One can create multiple instances of an integer stack.
*/
struct int_stack {
    unsigned int capacity;
    int* storage;
    unsigned int current;
};

/*
Creates a new stack and returns a pointer to it.
*/
struct int_stack* create();

/*
Destroys a stack along with its contents. Returns 0 if the operation was
successful. Returns 1 if the pointer passed to the function was NULL.
*/
int destroy(struct int_stack* sp);

/*
Pushes an integer to a stack. If the stack runs out of space additional storage
is allocated and the integer is added. If the stack pointer is NULL or if no
more memory could be allocated then it returns 1. Otherwise it returns 0.
*/
int push(struct int_stack* sp, int n);

/*
Pops an element from the stack and copies it to the pointer passed as the
second argument. Returns 0 when it succeeds and 1 if it fails. The function
fails when the stack is empty. Always check the return value of the function
before using the popped value.
*/
int pop(struct int_stack* sp, int* val);

/*
Returns 1 if the stack is empty, 0 otherwise.
*/
int is_empty(const struct int_stack* sp);
#endif
