#include "logger.h"
#include "tree.h"

#include <assert.h>
#include <stdio.h>
#include <stdlib.h>

void happy_path_1()
{
    struct int_tree* root = create(10);

    assert(root->data == 10);
    assert(root->left == NULL);
    assert(root->right == NULL);

    root = add(9, root);
    assert(root->left != NULL);
    assert(root->left->data == 9);

    root = add(5, root);
    root = add(-8, root);
    root = add(4, root);
    root = add(-4, root);

    assert(root != NULL);
    assert(6 == len(root));

    destroy(root);
}

void happy_path_2()
{
    struct int_tree *root = create(-9);
    int entries[] = {17, -1, 15, 4, 9, 7, -4, 20, 1};
    int i;

    for (i = 0; i < 9; i++) {
        root = add(entries[i], root);
    }

    assert(find(4, root) != 0);
    assert(find(13, root) == 0);

    destroy(root);
}

void printarray(int *ordering, int size) 
{
    int i;

    for (i = 0; i < size; i++) {
        if (i == size - 1) {
            printf("%d ", ordering[i]);
        } else {
            printf("%d, ", ordering[i]);
        }
    }
    printf("\n");
}

void happy_path_3()
{
    struct int_tree *root = create(11);
    int entries[] = {10, -2, 17, 4, 20, 2, 0, 15, 7};
    int i = 0;

    for (i = 0; i < 9; i++) {
        root = add(entries[i], root);
    }

    printf("Printing preorder: ");
    int *preorder = print(PREORDER, root);
    printarray(preorder, 10);

    printf("Printing inorder: ");
    int *inorder = print(INORDER, root);
    printarray(inorder, 10);

    printf("Printing postorder: ");
    int *postorder = print(POSTORDER, root);
    printarray(postorder, 10);

    free(preorder);
    free(inorder);
    free(postorder);
    destroy(root);
}

int main()
{
    happy_path_1();
    happy_path_2();
    happy_path_3();

    return 0;
}
