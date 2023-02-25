#include "logger.h"
#include "tree.h"

#include <assert.h>
#include <stdio.h>

void happy_path_1()
{
    struct int_tree* root = create(10);

    assert(root->data == 10);
    assert(root->left == NULL);
    assert(root->right == NULL);

    add(9, root);
    assert(root->left != NULL);
    assert(root->left->data == 9);

    add(5, root);
    add(-8, root);
    add(4, root);
    add(-4, root);

    assert(root != NULL);
    printf("%d\n", root->data);
    print(PREORDER, root);
    assert(6 == len(root));

    destroy(root);
}

int main()
{
    happy_path_1();

    return 0;
}
