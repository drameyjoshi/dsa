#include "stack.h"

#include <assert.h>
#include <stdio.h>
#include <stdlib.h>

void test_create_1()
{
    struct int_stack *sp1 = create();

    assert(sp1 != NULL);
    assert(sp1->storage != NULL);
    assert(sp1->current == 0);

    destroy(sp1);
}

void test_push_pop(int max_nums)
{
    struct int_stack *sp1 = create();

    int inputs[max_nums];
    int i;
/*    int *val = (int *)malloc(sizeof(int)); */
    int val;
    int success;

    for (i = 0; i < max_nums; ++i)
    {
        inputs[i] = rand();
        assert(sp1->current == i);
        push(sp1, inputs[i]);
        assert(sp1->current == i + 1);
    }

    for (i = max_nums - 1; i >= 0; --i)
    {
        assert(sp1->current == i + 1);
        success = pop(sp1, &val);
        assert(success == 1);
        assert(inputs[i] == val);
        assert(sp1->current == i);
    }

    success = pop(sp1, &val);
    assert(success == 0);

    destroy(sp1);
}

void happy_path_1()
{
    test_create_1();
    test_push_pop(50);
}

void happy_path_2()
{
    test_push_pop(5000);
}

int main()
{
    happy_path_1();
    happy_path_2();
}
