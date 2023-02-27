#include "tree.h"
#include "logger.h"

#include <stdio.h>
#include <stdlib.h>

void print_preorder(const struct int_tree* tp, int *index, int *ordering);
void print_inorder(const struct int_tree* tp, int *index, int *ordering);
void print_postorder(const struct int_tree* tp, int *index, int *ordering);
void count(const struct int_tree* tp, unsigned int* pn_elements);

struct int_tree* create(int n)
{
    struct int_tree* tp = (struct int_tree*)malloc(sizeof(struct int_tree));

    if (tp != NULL) {
        tp->data = n;
        tp->left = NULL;
        tp->right = NULL;
    }

    return tp;
}

struct int_tree* add(int n, struct int_tree* tp)
{
    struct int_tree* root = tp;
    struct int_tree* parent = NULL;

    int left = 0; /* A flag, 1 if we are moving left, 0 if moving right. */
    int found = 0; /* A flag, 1 if n is found in the tree, 0 otherwise. */
    while (tp != NULL) {
        if (n < tp->data) {
            parent = tp;
            tp = tp->left;
            left = 1;
        } else if (n > tp->data) {
            parent = tp;
            tp = tp->right;
            left = 0;
        } else {
            found = 1;
            break; /* Tree has n, no need to add. */
        }
    }

    if (0 == found) {
        if (left == 1) {
            parent->left = create(n);
        } else {
            parent->right = create(n);
        }
    }

    return root;
}

int find(int n, const struct int_tree* tp)
{
    int found = 0;

    while (tp != NULL) {
        if (n < tp->data) {
            tp = tp->left;
        } else if (n > tp->data) {
            tp = tp->right;
        } else if (n == tp->data) {
            found = 1;
            break;
        }
    }

    return found;
}

struct int_tree* rem(int n, struct int_tree* tp)
{
    struct int_tree* root = tp;
    struct int_tree* parent = NULL;
    int found = 0;
    int left = 0;

    while (found == 0 && tp != NULL) {
        if (n == tp->data) {
            found = 1;
            break;
        } else if (n < tp->data) {
            parent = tp;
            tp = tp->left;
            left = 1;
        } else if (n > tp->data) {
            parent = tp;
            tp = tp->right;
            left = 0;
        }
    }

    if (1 == found) {
        if (tp->left == NULL && tp->right == NULL) { /* Leaf. */
            if (1 == left) {
                parent->left = NULL;
            } else if (0 == left) {
                parent->right = NULL;
            }
            free(tp);
        } else if (tp->left != NULL && tp->right == NULL) {
            if (1 == left) {
                parent->left = tp->left;
            } else if (0 == left) {
                parent->left = tp->right;
            }
            free(tp);
        } else if (tp->left == NULL && tp->right != NULL) {
            if (1 == left) {
                parent->right = tp->left;
            } else if (0 == left) {
                parent->right = tp->right;
            }
            free(tp);
        } else {
            struct int_tree* inorder_succ_parent = tp;
            struct int_tree* inorder_successor = tp->right;
            struct int_tree* rp = tp->right->left;
            while (rp != NULL) {
                inorder_succ_parent = inorder_successor;
                inorder_successor = rp->left;
            }
            tp->data = inorder_successor->data;
            if (inorder_successor->right != NULL) {
                inorder_succ_parent->left = inorder_successor->right;
            }
            free(inorder_successor);
        }
    } else {
        info("%d was not found in the tree.\n", n);
    }

    return root;
}

int *print(traversal_t traversal, const struct int_tree* tp)
{
    int *ordering = (int *)calloc(len(tp), sizeof(int));
    int index = 0;

    if (traversal == PREORDER) {
        print_preorder(tp, &index, ordering);
    } else if (traversal == INORDER) {
        print_inorder(tp, &index, ordering);
    } else {
        print_postorder(tp, &index, ordering);
    }

    return ordering;
}

void print_preorder(const struct int_tree* tp, int *index, int *ordering)
{
    if (tp != NULL) {
        ordering[(*index)++] = tp->data;
        print_preorder(tp->left, index, ordering);
        print_preorder(tp->right, index, ordering);
    }
}

void print_inorder(const struct int_tree* tp, int *index, int *ordering)
{
    if (tp != NULL) {
        print_inorder(tp->left, index, ordering);
        ordering[(*index)++] = tp->data;
        print_inorder(tp->right, index, ordering);
    }
}

void print_postorder(const struct int_tree* tp, int *index, int *ordering)
{
    if (tp != NULL) {
        print_postorder(tp->left, index, ordering);
        print_postorder(tp->right, index, ordering);
        ordering[(*index)++] = tp->data;
    }
}

void destroy(struct int_tree* tp)
{
    if (tp != NULL) {
        destroy(tp->left);
        destroy(tp->right);
        free(tp);
    }
}

unsigned int len(const struct int_tree* tp)
{
    unsigned int n_elements = 0;
    count(tp, &n_elements);

    return n_elements;
}

void count(const struct int_tree* tp, unsigned int* pn_elements)
{
    if (tp != NULL) {
        (*pn_elements)++;
        count(tp->left, pn_elements);
        count(tp->right, pn_elements);
    }
}
