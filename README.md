# dsa
Data structures and algorithms in C and Python.

I want to refresh what I learnt about data structures and algorithms several 
years ago. I thought that the best way to do that would be write basic data 
structures and algorithms in a low-level language like C. There is a great joy 
in writing C programs. I may not use C in a professional setting but I will 
sharpen my skills if I write a lot of C programs.

A few points to note:
* I have tried to write the code clearly than cleverly. C permits and even
encourages conciseness. However, I have usually favoured a simple structure
over a shorter one.
* I prefer to use a brace even in cases where a block has a single statement
making the braces redundant.
* I use the <code>clang-format --style=WebKit -i *.[ch]</code> to format 
source code.
* I start with the simplest functions. The first version of my logger is not
at all a general purpose logging library but it suffices for my purpose. I may
enhance it later if a need arises.
* The first examples of my data structures will take integer data. I will 
generalise the implementations later.
* I run <code>valgrind --tool=memcheck --leak-check=full -s</code> to find 
memory leaks.

It is often easy to write an algorithm first in Python and then translate it
to C. A few algorithms are therefore in Python notebooks.
