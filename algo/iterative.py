def fibonacci(n: int) -> int:
    '''
    Get the n-th Fibonacci number. n should be an integer greater than 1.
    '''
    if n < 1:
        raise ValueError('Terms of a sequence start from 1.')
    elif n < 3:
        return 1
    else:
        last = 1
        second_last = 1
        m = 3
        while m <= n:
            last, second_last = (last + second_last), last
            m += 1

        return last

def hcf(m: int, n: int) -> int:
    '''
    A non-recursice implementation of the Euclid algorithm.
    Parameters:
    m, n: integers

    Returns: hcf (gcd) of the integer arguments
    '''
    while n != 0:
        r = m % n
        m, n = n, r

    return m

if __name__ == '__main__':
    print('Testing the hcf algorithm')
    assert hcf(4, 6) == 2
    assert hcf(1071, 462) == 21
    assert hcf(243, 300) == 3
    assert hcf(0, 4) == 4
