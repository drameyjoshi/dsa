#ifndef _GRAPH_H_
#define _GRAPH_H_

#include "list.h"

#include <stdio.h>

struct graph {
    int n_vertices;
    struct int_list** adjacency;
};

struct graph* create(int n_vertices);

int add_edge(const struct graph *gp, int src, int dest, int check_data);

struct graph* generate_random(int n_vertices, float probability);

void destroy_graph(struct graph* gp);

void print_graph(FILE* fp, const struct graph* gp);

void bfs(const struct graph* gp);

void dfs(const struct graph* gp);
#endif
