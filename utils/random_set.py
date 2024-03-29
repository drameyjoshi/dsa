#!/bin/python
import argparse
import random
import sys

from typing import List

def generate(a: int, b: int, n: int) -> List[int]:
    """
    Returns n randomly generated integers between a and b, both inclusive.

    Parameters:
    a: lower limit
    b: upper limit
    n: number of integers

    Returns:
    A list of randomly generated integers.
    """
    if a > b:
        a, b = b, a

    if n > b - a + 1:
        n = b - a + 1

    S = set()
    while len(S) < n:
        S.add(random.randint(a, b))

    return list(S)

def main(argv):
    parser = argparse.ArgumentParser(prog='random_set', 
        description='Generate a set of randomly chosen integers',
        epilog='')

    parser.add_argument('-m', '--min', help='lowest random number.')
    parser.add_argument('-M', '--max', help='highest random number.')
    parser.add_argument('-s', '--size', help='# integers.')

    args = parser.parse_args()
    low = int(args.min)
    high = int(args.max)
    nelems = int(args.size)

    L = generate(low, high, nelems)
    for n in range(3):
        random.shuffle(L)

    print(L)

if __name__ == '__main__':
    main(sys.argv)

