#include "graph.h"

void test_case_1()
{
    struct graph *gp = create(5);

    add_edge(gp, 0, 1, 1);
    add_edge(gp, 1, 2, 1);
    add_edge(gp, 0, 2, 1);
    add_edge(gp, 2, 3, 1);
    add_edge(gp, 3, 4, 1);

    print_graph(stdout, gp);
    destroy_graph(gp);
}

int main()
{
    test_case_1();
    return 0;
}

