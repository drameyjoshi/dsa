#include "graph.h"
#include "logger.h"
#include "list.h"

#include <assert.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

struct graph* create(int n_vertices)
{
    struct graph* gp = (struct graph*)malloc(sizeof(struct graph));

    if (gp != NULL) {
        gp->n_vertices = n_vertices;
        gp->adjacency = (struct int_list**)calloc(n_vertices,
            sizeof(struct int_list*));
    }

    if (gp->adjacency == NULL) {
        free(gp);
        gp = NULL;
    }

    return gp;
}

struct graph *generate_random(int n_vertices, float probability)
{
    struct graph *gp = create(n_vertices);
    int seed = (int)time(NULL);
    int check_data = 0;
    int i, j;

    assert(0 < probability);
    assert(probability < 1);
    srand(seed);

    for (i = 0; i < n_vertices; ++i) {
        for (j = i + 1; j < n_vertices; ++j) {
            float p = rand()/RAND_MAX;
            if (p > probability) {
                add_edge(gp, i, j, check_data);
            }
        }
    }

    return gp;
}

int add_edge(const struct graph *gp, int src, int dest, int check_data) 
{
    int success = 1;

    if (check_data == 1) {
        if (gp == NULL) {
            success = 0;
            warn("Passed NULL pointer to add_edge.");
        }

        if (src < 0 || src >= gp->n_vertices) {
            success = 0;
            error("Source vertex is out of bounds.");
        }

        if (dest < 0 || dest >= gp->n_vertices) {
            success = 0;
            error("Destination vertex is out of bounds.");
        }
    }

    if (success == 1) {
        if (gp->adjacency[src] == NULL) {
            gp->adjacency[src] = create_list(dest);
        } else if (find_in_list(dest, gp->adjacency[src]) == -1) {
            add_to_list(dest, gp->adjacency[src]);
        }

        if (gp->adjacency[dest] == NULL) {
            gp->adjacency[dest] = create_list(src);
        } else if (find_in_list(src, gp->adjacency[dest]) == -1) {
            add_to_list(src, gp->adjacency[dest]);
        }
    }

    return success;
}

void destroy_graph(struct graph *gp)
{
    if (gp != NULL) {
        int i;

        for (i = 0; i < gp->n_vertices; ++i) {
            destroy_list(gp->adjacency[i]);
        }
        free(gp->adjacency);
        free(gp);
    }
}

void print_graph(FILE *fp, const struct graph *gp)
{
    if (gp != NULL && fp != NULL) {
        int i;

        fprintf(fp, "# vertices = %d\n", gp->n_vertices); 
        for (i = 0; i < gp->n_vertices; ++i) {
            fprintf(fp, "%d: ", i);
            print_list(fp, gp->adjacency[i]);
        }
    }
}
