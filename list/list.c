#include "list.h"

#include <stdlib.h>

/* To do: Add logging. */

struct int_list* create_list(int n)
{
    struct int_list* lp = (struct int_list*)malloc(sizeof(struct int_list));

    if (lp != NULL) {
        lp->data = n;
        lp->next = NULL;
    }

    return lp;
}

struct int_list* destroy_list(struct int_list* lp)
{
    while (lp != NULL) {
        struct int_list* nlp = lp->next;
        free(lp);
        lp = nlp;
    }

    return NULL;
}

int find_in_list(int n, const struct int_list* lp)
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

struct int_list* rem_from_list(int n, struct int_list* lp)
{
    struct int_list* new = lp;

    if (lp != NULL) {
        if (lp->data == n) {
            new = lp->next;
            free(lp);
        } else {
            struct int_list* prev = lp;
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

struct int_list* add_to_list(int n, struct int_list* lp)
{
    struct int_list* curr = lp;
    if (lp == NULL) {
        lp = create_list(n);
    } else {
        while (1) {
            if (curr->next == NULL) {
                curr->next = create_list(n);
                break;
            } else {
                curr = curr->next;
            }
        }
    }

    return lp;
}

unsigned int len_of_list(const struct int_list* lp)
{
    int nelems = 0;

    while (lp != NULL) {
        ++nelems;
        lp = lp->next;
    }

    return nelems;
}

void print_list(FILE *fp, const struct int_list* lp)
{
    if (fp != NULL) {
        if (lp != NULL) {
            while (lp != NULL) {
                if (lp->next != NULL) {
                    fprintf(fp, "%d, ", lp->data);
                } else {
                    fprintf(fp, "%d\n", lp->data);
                }
                lp = lp->next;
            }
        }
    }
}
