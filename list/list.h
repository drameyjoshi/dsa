#ifndef _LIST_H_
#define _LIST_H_

struct int_sllist {
	int data;
	struct int_sllist *next;
};

struct int_sllist *create(int n);

void destroy(struct int_sllist *lp);

struct int_sllist *add(int n, struct int_sllist *lp);

int find(int n, const struct int_sllist *lp);

struct int_sllist *rem(int n, struct int_sllist *lp);

unsigned int len(const struct int_sllist *lp);

#endif
