import numpy as np
import os

from typing import List

class BinarySearch():
    '''
    A class that implements binary search on integer data. The data to be
    searched can be fed as:
    1. a list of integers as an argument to the setSearchData method or
    2. name of a file with integers, one per line.
    '''
    def __init__(self):
        self._data = None

    def setSearchData(self, L: List[int]) -> None:
        '''
        Sets the data to be searched. Expects a list of integers.
        '''
        self._data = [n for n in L]

    def read(self, datafile: str) -> None:
        '''
        Sets the data to be searched from a text file.
        '''
        if os.path.exists(datafile):
            self._data = np.loadtxt(datafile, dtype=int).tolist()            

    def find(self, n: int) -> int:
        '''
        Returns the index of n if it is there in the data. Otherwise, returns
        -1.
        '''
        if self._data:
            self._data.sort()
            minIndex = 0
            maxIndex = len(self._data) - 1

            while minIndex <= maxIndex:
                mid = minIndex + int((maxIndex - minIndex)/2)                
                if self._data[mid] > n:
                    maxIndex = mid - 1
                elif self._data[mid] < n:
                    minIndex = mid + 1
                else:
                    return mid

            return -1
        else:
            return -1

if __name__ == '__main__':
    # How to use this class?
    bs = BinarySearch()
    bs.setSearchData([53, 190, 197, 15, 79, 192, 162, 58, 18, 122, 103, 32])
    assert bs.find(58) == 4
