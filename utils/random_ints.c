#include <getopt.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>

struct args {
    int n_elems;
    int min;
    int max;
};

void show(int *numbers, int n_elems)
{
    int i;

    for (i = 0; i < n_elems; i++) {
        if (i == n_elems - 1) {
            printf("%d\n", numbers[i]);
        } else {
            printf("%d, ", numbers[i]);
        }
    }
}

void init_args(struct args* pargs)
{
    pargs->n_elems = 0;
    pargs->min = 0;
    pargs->max = RAND_MAX;
}

void generate(struct args* pargs, int* numbers)
{
    time_t now = time(NULL);
    int seed = (int)(now);
    int range = (pargs->max) - (pargs->min);
    int i;

    srand(seed);
    for (i = 0; i < pargs->n_elems; i++) {
        int r = rand();
        int s = r;

        if (pargs->max != RAND_MAX) {
            float f = ((1.0 * r) / RAND_MAX) * range;
            s = pargs->min + (int)f;
        }
        numbers[i] = s;
    }
}

void read_options(int argc, char* argv[], struct args* pargs)
{
    int args_ok = 0;
    int opt;
    void show_help_and_exit();

    if (argc < 2) {
        show_help_and_exit();
    }

    while ((opt = getopt(argc, argv, "n:m:M:")) != -1) {
        switch (opt) {
        case 'n':
            pargs->n_elems = atoi(optarg);
            args_ok = 1;
            break;
        case 'm':
            pargs->min = atoi(optarg);
            break;
        case 'M':
            pargs->max = atoi(optarg);
            break;
        default:
            break;
        }
    }

    if (args_ok == 0) {
        show_help_and_exit();
    }

    if (pargs->max < pargs->min) {
        int temp = pargs->max;
        pargs->max = pargs->min;
        pargs->min = temp;
    }
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

int main(int argc, char* argv[])
{
    struct args parsed_args;
    int* numbers = NULL;

    init_args(&parsed_args);
    read_options(argc, argv, &parsed_args);
    numbers = (int*)calloc(parsed_args.n_elems, sizeof(int));
    generate(&parsed_args, numbers);
    show(numbers, parsed_args.n_elems);
    free(numbers);

    exit(EXIT_SUCCESS);
}

