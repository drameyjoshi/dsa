#include <getopt.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char* argv[])
{
    time_t now = time(NULL);
    int seed = (int)(now);
    int n_elems = 0;
    int min = 0;
    int max = RAND_MAX;
    int i;
    int opt;
    int args_ok = 0;
    int range;

    void show_help_and_exit();

    if (argc < 2) {
        show_help_and_exit();
    }

    while ((opt = getopt(argc, argv, "n:m:M:")) != -1) {
        switch (opt) {
        case 'n':
            n_elems = atoi(optarg);
            args_ok = 1;
            break;
        case 'm':
            min = atoi(optarg);
            break;
        case 'M':
            max = atoi(optarg);
            break;
        default:
            break;
        }
    }

    if (args_ok == 0) {
        show_help_and_exit();
    }

    if (max < min) {
        int temp = max;
        max = min;
        min = max;
    }

    range = max - min;

    for (i = 0; i < n_elems; i++) {
        int r = rand_r(&seed);
        int s = r;

        if (max != RAND_MAX) {
            float f = ((1.0 * r) / RAND_MAX) * range;
            s = min + (int)f;
        }
        printf("%d ", s);
    }
    printf("\n");

    exit(EXIT_SUCCESS);
}

void show_help_and_exit()
{
    printf("random_ints -n <number of ints> [-m <min number>] [-M <max number>].\n");
    printf("\n");
    printf("-n: the number of pseudo-random numbers.\n");
    printf("-m: the lower limit of the generated numbers. Default is 0.\n");
    printf("-M: the upper limit of the generated numbers. Default is RAND_MAX\n");
    printf("\n");

    exit(EXIT_FAILURE);
}
