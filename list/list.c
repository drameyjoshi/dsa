#include "list.h"

#include <stdlib.h>

/* To do: Add logging. */

struct int_sllist *create(int n)
{
	struct int_sllist *lp =
	    (struct int_sllist *)malloc(sizeof(struct int_sllist));

	if (lp != NULL) {
		lp->data = n;
		lp->next = NULL;
	}

	return lp;
}

void destroy(struct int_sllist *lp)
{
	while (lp != NULL) {
		struct int_sllist *nlp = lp->next;
		free(lp);
		lp = nlp;
	}
}

int find(int n, const struct int_sllist *lp)
{
	int pos = -1;
	int found = 0;

	while (lp != NULL) {
		++pos;
		if (n == lp->data) {
			found = 1;
			break;
		}
		lp = lp->next;
	}

	return found > 0 ? pos : -1;
}

struct int_sllist *rem(int n, struct int_sllist *lp)
{
	struct int_sllist *new = lp;

	if (lp != NULL) {
		if (lp->data == n) {
			new = lp->next;
			free(lp);
		} else {
			struct int_sllist *prev = lp;
			lp = lp->next;
			while (lp != NULL) {
				if (lp->data == n) {
					prev->next = lp->next;
					free(lp);
					break;
				} else {
					prev = lp;
					lp = lp->next;
				}
			}
		}
	}

	return new;
}

struct int_sllist *add(int n, struct int_sllist *lp)
{
	struct int_sllist *curr = lp;
	if (lp == NULL) {
		lp = create(n);
	} else {
		while (1) {
			if (curr->next == NULL) {
				curr->next = create(n);
				break;
			} else {
				curr = curr->next;
			}
		}
	}

	return lp;
}

unsigned int len(const struct int_sllist *lp)
{
	int nelems = 0;

	while (lp != NULL) {
		++nelems;
		lp = lp->next;
	}

	return nelems;
}
