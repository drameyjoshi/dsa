#include "list.h"
#include "logger.h"

#include <assert.h>
#include <stdio.h>

void happy_path_1()
{
    struct int_list* lp = create_list(0);
    int i;
    assert(lp != NULL);
    assert(len_of_list(lp) == 1);

    for (i = 1; i < 10; ++i)
        lp = add_to_list(i, lp);

    assert(len_of_list(lp) == 10);
    assert(find_in_list(3, lp) != -1);
    assert(find_in_list(5, lp) != -1);
    assert(find_in_list(1, lp) != -1);
    assert(find_in_list(9, lp) != -1);
    assert(find_in_list(7, lp) != -1);

    lp = rem_from_list(6, lp);
    assert(len_of_list(lp) == 9);
    assert(find_in_list(6, lp) == -1);
    assert(find_in_list(3, lp) != -1);
    assert(find_in_list(5, lp) != -1);
    assert(find_in_list(1, lp) != -1);
    assert(find_in_list(9, lp) != -1);
    assert(find_in_list(7, lp) != -1);

    lp = destroy_list(lp);
    assert(lp == NULL);
    info("Passed %s.", __func__);
}

void unusual_path()
{
    struct int_list* lp = NULL;
    assert(len_of_list(lp) == 0);
    assert(find_in_list(3, lp) == -1);
    destroy_list(lp);

    lp = add_to_list(-1, lp);
    assert(lp != NULL);

    lp = destroy_list(lp);
    assert(lp == NULL);
    info("Passed %s.", __func__);
}

int main()
{
    happy_path_1();
    unusual_path();

    return 0;
}
