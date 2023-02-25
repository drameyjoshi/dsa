#ifndef _LIST_H_
#define _LIST_H_

struct int_list {
    int data;
    struct int_list* next;
};

struct int_list* create(int n);

struct int_list* destroy(struct int_list* lp);

struct int_list* add(int n, struct int_list* lp);

int find(int n, const struct int_list* lp);

struct int_list* rem(int n, struct int_list* lp);

unsigned int len(const struct int_list* lp);

#endif
