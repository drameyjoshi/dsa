#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char *argv[])
{
    time_t now = time(NULL);
    int seed = (int)(now);
    int n_elems = 0;
    int max_number = RAND_MAX;
    int i;

    void show_help();

    if (argc >= 2) {
        n_elems = atoi(argv[1]);
        if (argc >= 3) {
            max_number = atoi(argv[2]);
        }
    } else {
        show_help();
        exit(EXIT_FAILURE);
    }

    for (i = 0; i < n_elems; i++) {
        int r = rand_r(&seed);
        int s = r;

        if (max_number != RAND_MAX) {
            float f = ((1.0 * r)/RAND_MAX) * max_number;
            s = (int)f;
        }
        printf("%d ", s);
    }
    printf("\n");

    exit(EXIT_SUCCESS);
}

void show_help()
{
    printf("random_ints n_numbers [max_number].\n");
    printf("\n");
    printf("n_numbers: the number of pseudo-random numbers.\n");
    printf("max_number: the upper limit of the generated numbers.\n");
    printf("\n");
}

