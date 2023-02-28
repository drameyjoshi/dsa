#ifndef _LIST_H_
#define _LIST_H_

struct int_list {
    int data;
    struct int_list* next;
};

struct int_list* create_list(int n);

struct int_list* destroy_list(struct int_list* lp);

struct int_list* add_to_list(int n, struct int_list* lp);

int find_in_list(int n, const struct int_list* lp);

struct int_list* rem_from_list(int n, struct int_list* lp);

unsigned int len_of_list(const struct int_list* lp);

#endif
