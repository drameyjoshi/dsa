#include "list.h"
#include "logger.h"

#include <assert.h>
#include <stdio.h>

void happy_path_1()
{
	struct int_sllist *lp = create(0);
	int i;
	assert(lp != NULL);
	assert(len(lp) == 1);

	for (i = 1; i < 10; ++i)
		lp = add(i, lp);

	assert(len(lp) == 10);
	assert(find(3, lp) != -1);
	assert(find(5, lp) != -1);
	assert(find(1, lp) != -1);
	assert(find(9, lp) != -1);
	assert(find(7, lp) != -1);

	lp = rem(6, lp);
	assert(len(lp) == 9);
	assert(find(6, lp) == -1);
	assert(find(3, lp) != -1);
	assert(find(5, lp) != -1);
	assert(find(1, lp) != -1);
	assert(find(9, lp) != -1);
	assert(find(7, lp) != -1);

	destroy(lp);
    info("Passed %s.", __func__);
}

int main()
{
	happy_path_1();
}
