#ifndef _TREE_H_
#define _TREE_H_

struct int_tree {
    int data;
    struct int_tree* left;
    struct int_tree* right;
};

typedef enum { PREORDER,
    INORDER,
    POSTORDER } traversal_t;

struct int_tree* create(int n);

void destroy(struct int_tree* tp);

struct int_tree* add(int n, struct int_tree* tp);

int find(int n, const struct int_tree* tp);

struct int_tree* rem(int n, struct int_tree* tp);

unsigned int len(const struct int_tree* tp);

int *print(traversal_t traversal, const struct int_tree* tp);
#endif
