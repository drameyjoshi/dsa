#ifndef _GRAPH_H_
#define _GRAPH_H_

#include "list.h"

struct graph {
    int n_vertices;
    struct int_list** adjacency;
};

struct graph* create(int n_vertices);

int add_edge(const struct graph *gp, int src, int dest);

struct graph* generate_random(int n_vertices, float probability);

void destroy(struct graph* gp);

void print(const struct graph* gp);

void bfs(const struct graph* gp);

void dfs(const struct graph* gp);
#endif
